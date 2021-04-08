package cn.zheng.controller;

import cn.zheng.domain.Student;
import cn.zheng.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("stu")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("allStu.ctrl")
    public ModelAndView allStudents() {
        ModelAndView mv = new ModelAndView();
        int count = studentService.selectCount();
        List<Student> students = studentService.selectAllStudents();
        mv.addObject("count", count);
        mv.addObject("students", students);
        mv.setViewName("/allStudents.jsp");
        return mv;
    }

    @RequestMapping("selectStu.ctrl")
    public ModelAndView selectStudent(int id) {
        ModelAndView mv = new ModelAndView();
        Student student = studentService.selectStudentById(id);
        if (student != null) {
            mv.addObject("student", student);
            mv.setViewName("../selectStudent.jsp");
        } else {
            mv.addObject("queryMsg", "查询失败！");
            mv.setViewName("redirect:allStu.ctrl");
        }
        return mv;
    }

    @RequestMapping("insertStu.ctrl")
    public ModelAndView addStudent(Student student) {
        ModelAndView mv = new ModelAndView();
        int row = studentService.insertStudent(student);
        if (row > 0) {
            mv.addObject("insertMsg", "添加成功！");
        } else {
            mv.addObject("insertMsg", "添加失败！");
        }
        mv.setViewName("redirect:allStu.ctrl");
        return mv;
    }

    @RequestMapping("updateStu.ctrl")
    public ModelAndView updateStudent(Student student) {
        ModelAndView mv = new ModelAndView();
        int row = studentService.updateStudent(student);
        if (row > 0) {
            mv.addObject("updateMsg", "修改成功！");
        } else {
            mv.addObject("updateMsg", "修改失败！");
        }
        mv.setViewName("redirect:allStu.ctrl");
        return mv;
    }

    @RequestMapping("deleteStu.ctrl")
    public ModelAndView deleteStudent(int id) {
        ModelAndView mv = new ModelAndView();
        int row = studentService.deleteStudentById(id);
        if (row > 0) {
            mv.addObject("deleteMsg", "删除成功！");
        } else {
            mv.addObject("deleteMsg", "删除失败！");
        }
        mv.setViewName("redirect:allStu.ctrl");
        return mv;
    }


}
