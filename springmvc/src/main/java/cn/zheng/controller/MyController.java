package cn.zheng.controller;

import cn.zheng.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {

    @RequestMapping(value = "some.do")
    public ModelAndView doSome() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "欢迎使用springmvc做web开发");
        mv.addObject("fun", "执行的是doSome方法");
        mv.setViewName("show");
        return mv;
    }

    //逐个参数接收
    @RequestMapping(value = "register.do")
    public ModelAndView doRegister(String name, int age) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("myName", name);
        mv.addObject("myAge", age);
        mv.setViewName("show");
        return mv;
    }

    //对象参数接收
    @RequestMapping(value = "register1.do")
    public ModelAndView doRegister1(Student student) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("myStudent", student);
        mv.setViewName("show");
        return mv;
    }

    //返回String（逻辑视图名）
    @RequestMapping(value = "register2.do")
    public String register2(HttpServletRequest request, Student student) {
        request.setAttribute("myStudent", student);
        return "show";
    }

    //请求转发
    @RequestMapping(value = "register3.do")
    public ModelAndView doForward(String name, Integer age) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("myName", name);
        mv.addObject("myAge", age);
        //请求转发，添加"forward"，此时视图不与视图解析器一同工作，视图页面必须写出相对于项目根的路径
        mv.setViewName("forward:show.jsp");
        return mv;
    }

    //转发重定向
    @RequestMapping(value = "register4.do")
    public ModelAndView doRedirect(String name, Integer age) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("myName", name);
        mv.addObject("myAge", age);
        //转发重定向，添加"redirect"
        mv.setViewName("redirect:show.jsp");
        return mv;
    }


}
