package cn.zheng.service;

import cn.zheng.common.MyBatisUtil;
import cn.zheng.dao.SwordmanDao;
import cn.zheng.domain.Swordman;

import java.util.List;

public class SwordmanServiceImpl implements SwordmanService {

    SwordmanDao swordmanDao = MyBatisUtil.getSqlSession().getMapper(SwordmanDao.class);

    @Override
    public int insertSwordman(Swordman swordman) {
        return swordmanDao.insertSwordman(swordman);
    }

    @Override
    public int deleteSwordman(int id) {
        return swordmanDao.deleteSwordman(id);
    }

    @Override
    public int updateSwordman(Swordman swordman) {
        return swordmanDao.updateSwordman(swordman);
    }

    @Override
    public int selectAllNum() {
        return swordmanDao.selectAllNum();
    }

    @Override
    public Swordman selectSwordman(int id) {
        return swordmanDao.selectSwordman(id);
    }

    @Override
    public List<Swordman> allSwordmans() {
        return swordmanDao.allSwordmans();
    }

    @Override
    public Swordman selectSwordmanByIdAndName(int id, String name) {
        return swordmanDao.selectSwordmanByIdAndName(id, name);
    }

    @Override
    public List<Swordman> selectSwordmanDynamicSQL(int age) {
        return swordmanDao.selectSwordmanDynamicSQL(age);
    }
}
