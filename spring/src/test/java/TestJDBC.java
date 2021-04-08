import cn.zheng.JDBC.bean.User;
import cn.zheng.JDBC.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestJDBC {

    @Test
    public void testJDBC() {
        ApplicationContext context = new ClassPathXmlApplicationContext("JDBC.xml");
        UserService userService = context.getBean("userService", UserService.class);

        //添加
        User user1 = new User(10, "白展堂", 31);
        userService.add(user1);

        //修改
        User user2 = new User(10, "白玉汤", 29);
        userService.update(user2);

        //删除
        int id = 10;
        userService.delete(id);

        //批量添加
        List<Object[]> batchArgs1 = new ArrayList<>();
        Object[] o1 = {11, "佟湘玉", 25};
        Object[] o2 = {12, "郭芙蓉", 23};
        Object[] o3 = {13, "李大嘴", 30};
        batchArgs1.add(o1);
        batchArgs1.add(o2);
        batchArgs1.add(o3);
        userService.batchAdd(batchArgs1);

        //查询返回某个值
        int count = userService.findCount();
        System.out.println("表内一共有" + count + "行数据");

        //查询返回对象
        User user3 = userService.findOne(11);
        System.out.println(user3);

        //查询返回集合
        List<User> list = userService.findAll();
        System.out.println(list);

        //批量修改
        List<Object[]> batchArgs2 = new ArrayList<>();
        Object[] o4 = {"佟湘玉", 99, 11};
        Object[] o5 = {"郭芙蓉", 99, 12};
        Object[] o6 = {"李大嘴", 99, 13};
        batchArgs2.add(o4);
        batchArgs2.add(o5);
        batchArgs2.add(o6);
        userService.batchUpdate(batchArgs2);

        //批量删除
        List<Object[]> batchArgs3 = new ArrayList<>();
        Object[] o7 = {11};
        Object[] o8 = {12};
        Object[] o9 = {13};
        batchArgs3.add(o7);
        batchArgs3.add(o8);
        batchArgs3.add(o9);
        userService.batchDelete(batchArgs3);


    }

}
