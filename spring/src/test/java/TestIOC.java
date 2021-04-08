import cn.zheng.IOC.Emp;
import cn.zheng.IOC.Stu;
import cn.zheng.IOC.UserService;
import cn.zheng.IOC.Order;
import cn.zheng.IOC.config.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {

    @Test
    public void testSetProperty_XML() {
        System.out.println("基于xml配置实现属性注入");
        String config = "IOC_XML.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
        System.out.println(emp.getDept().getName());
        System.out.println("----------------------------------------------------------------------------------");
        Stu stu = context.getBean("stu", Stu.class);
        System.out.println(stu);
    }

    @Test
    public void testLifeCycle() {
        System.out.println("bean的生命周期");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("IOC_XML.xml");
        Order order = context.getBean("order", Order.class);
        System.out.println("第四步：获取创建bean实例对象");
        System.out.println(order);
        context.close();
    }

    @Test
    public void testAnnotation() {
        System.out.println("基于注解方式实现属性注入");
        ApplicationContext context = new ClassPathXmlApplicationContext("IOC_annotation.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
        userService.getUserDao().add();
    }

    @Test
    public void testConfigClass() {
        System.out.println("使用config类完全注解开发");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
        userService.getUserDao().add();
    }


}
