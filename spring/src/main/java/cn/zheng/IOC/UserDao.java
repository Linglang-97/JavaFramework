package cn.zheng.IOC;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component(value = "userDaoImpl1")
public class UserDao {
    public void add() {
        System.out.println("dao add.............");
    }
}
