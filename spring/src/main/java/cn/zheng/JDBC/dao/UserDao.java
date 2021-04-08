package cn.zheng.JDBC.dao;

import cn.zheng.JDBC.bean.User;

import java.util.List;

public interface UserDao {

    void add(User user);

    void update(User user);

    void delete(int id);

    int selectCount();

    User findUser(int id);

    List<User> findAllUser();

    void batchAddUser(List<Object[]> batchArgs);

    void batchUpdateUser(List<Object[]> batchArgs);

    void batchDeleteUser(List<Object[]> batchArgs);

}
