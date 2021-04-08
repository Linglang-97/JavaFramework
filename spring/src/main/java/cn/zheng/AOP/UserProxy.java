package cn.zheng.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class UserProxy {

    //相同切入点抽取
    @Pointcut(value = "execution(* cn.zheng.AOP.User.add(..))")
    public void point() {
    }

    //前置通知
    @Before(value = "point()")
    public void before() {
        System.out.println("before.....");
    }

    //后置通知（返回通知）
    @AfterReturning(value = "point()")
    public void afterReturning() {
        System.out.println("afterReturn.....");
    }

    //最终通知
    @After(value = "point()")
    public void after() {
        System.out.println("after.....");
    }

    //异常通知
    @AfterThrowing(value = "point()")
    public void AfterThrowing() {
        System.out.println("afterThrowing.....");
    }

    //环绕通知
    @Around(value = "point()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前.....");
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后.....");
    }

}
