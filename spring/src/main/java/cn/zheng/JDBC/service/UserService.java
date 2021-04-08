package cn.zheng.JDBC.service;

import cn.zheng.JDBC.bean.User;
import cn.zheng.JDBC.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserService {
    @Autowired
    private UserDao userDao;

    public void add(User user) {
        userDao.add(user);
    }

    public void update(User user) {
        userDao.update(user);
    }

    public void delete(int id) {
        userDao.delete(id);
    }

    public int findCount() {
        return userDao.selectCount();
    }

    public User findOne(int id) {
        return userDao.findUser(id);
    }

    public List<User> findAll() {
        return userDao.findAllUser();
    }

    public void batchAdd(List<Object[]> batchArgs) {
        userDao.batchAddUser(batchArgs);
    }

    public void batchUpdate(List<Object[]> batchArgs) {
        userDao.batchUpdateUser(batchArgs);
    }

    public void batchDelete(List<Object[]> batchArgs) {
        userDao.batchDeleteUser(batchArgs);
    }

}
