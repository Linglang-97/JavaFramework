import cn.zheng.common.MyBatisUtil;
import cn.zheng.domain.Swordman;
import cn.zheng.service.SwordmanService;
import cn.zheng.service.SwordmanServiceImpl;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class MyBatisTest {

    //传统Dao开发
    @Test
    public void test1() throws IOException {
        SqlSession session = MyBatisUtil.getSqlSession();

        String daoPath = "cn.zheng.dao.SwordmanDao.";
        Swordman swordman;
        int id, rows;

        //增加
        swordman = new Swordman(10, "杨慧兰", Swordman.Gender.女, 25, "小偷");
        rows = session.insert(daoPath + "insertSwordman", swordman);
        session.commit();
        System.out.println("增加记录" + rows + "：" + swordman);

        //删除
        id = 10;
        rows = session.delete(daoPath + "deleteSwordman", id);
        session.commit();
        System.out.println("删除记录" + rows + "：id = " + id);

        //修改
        swordman = new Swordman(7, "祝无双", Swordman.Gender.女, 22, "捕快");
        rows = session.update(daoPath + "updateSwordman", swordman);
        session.commit();
        System.out.println("修改记录" + rows + "：" + swordman);

        //查询行数
        rows = session.selectOne(daoPath + "selectAllNum");
        session.commit();
        System.out.println("表内所有数量：" + rows);

        //查询某个对象
        id = 5;
        swordman = session.selectOne(daoPath + "selectSwordman", id);
        session.commit();
        System.out.println("id为" + id + "的对象为：" + swordman);

        //查询得到list
        List<Swordman> swordmanList = session.selectList("cn.zheng.dao.SwordmanDao.allSwordmans");
        session.commit();
        System.out.println("\n表内所有数据：");
        swordmanList.forEach(swordmanItr -> System.out.println(swordmanItr));

        session.close();

    }


    //Dao代理
    @Test
    public void test2() {
        SwordmanService swordmanService = new SwordmanServiceImpl();
        List<Swordman> swordmanList = swordmanService.allSwordmans();
        for (Swordman s : swordmanList)
            System.out.println(s);
        System.out.println("\n");
        Swordman swordman = swordmanService.selectSwordmanByIdAndName(1, "白展堂");
        System.out.println(swordman);
    }

    //动态SQL
    @Test
    public void test3() {
        SwordmanService swordmanService = new SwordmanServiceImpl();
        List<Swordman> swordmanList = swordmanService.selectSwordmanDynamicSQL(27);
        for (Swordman itr : swordmanList)
            System.out.println(itr);
    }

}
