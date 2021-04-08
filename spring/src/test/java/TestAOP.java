import cn.zheng.AOP.User;
import cn.zheng.AOP.config.ConfigAop;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {

    @Test
    public void testAOP_annotation() {
        ApplicationContext context = new ClassPathXmlApplicationContext("AOP_annotation.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void testAOP_configClass() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigAop.class);
        User user = context.getBean("user", User.class);
        user.add();
    }

}
