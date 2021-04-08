package cn.zheng.JDBC.dao;

import cn.zheng.JDBC.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(User user) {
        String sql = "insert into user values(?,?,?)";
        Object[] args = {user.getId(), user.getName(), user.getAge()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public void update(User user) {
        String sql = "update user set name = ?, age = ? where id = ?";
        Object[] args = {user.getName(), user.getAge(), user.getId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public void delete(int id) {
        String sql = "delete from user where id = ?";
        Object[] args = {id};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public int selectCount() {
        String sql = "select count(*) from user";
        int count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public User findUser(int id) {
        String sql = "select * from user where id = ?";
        Object[] args = {id};
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), args);
        return user;
    }

    @Override
    public List<User> findAllUser() {
        String sql = "select * from user";
        List<User> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return list;
    }

    @Override
    public void batchAddUser(List<Object[]> batchArgs) {
        String sql = "insert into user value(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchUpdateUser(List<Object[]> batchArgs) {
        String sql = "update user set name = ?, age = ? where id = ?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchDeleteUser(List<Object[]> batchArgs) {
        String sql = "delete from user where id = ?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }
}
