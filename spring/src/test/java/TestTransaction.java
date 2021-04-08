import cn.zheng.transaction.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTransaction {

    @Test
    public void testTransaction() {
        ApplicationContext context = new ClassPathXmlApplicationContext("transaction.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

}
