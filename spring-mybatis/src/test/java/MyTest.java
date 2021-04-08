import cn.zheng.domain.Swordman;
import cn.zheng.service.SwordmanService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test() {
        String springConfig = "mySpring.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
        SwordmanService swordmanService = context.getBean("mySwordmanService", SwordmanService.class);
        int count = swordmanService.selectAllNum();
        System.out.println(count);

        List<Swordman> list = swordmanService.allSwordmans();
        for (Swordman itr : list)
            System.out.println(itr);
    }
}
