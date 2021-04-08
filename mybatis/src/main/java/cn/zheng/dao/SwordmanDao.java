package cn.zheng.dao;

import cn.zheng.domain.Swordman;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SwordmanDao {

    int insertSwordman(Swordman swordman);

    int deleteSwordman(int id);

    int updateSwordman(Swordman swordman);

    int selectAllNum();

    Swordman selectSwordman(int id);

    List<Swordman> allSwordmans();

    Swordman selectSwordmanByIdAndName(@Param("swordmanId") int id, @Param("swordmanName") String name);

    List<Swordman> selectSwordmanDynamicSQL(int age);

}
