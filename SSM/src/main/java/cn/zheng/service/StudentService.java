package cn.zheng.service;

import cn.zheng.domain.Student;

import java.util.List;

public interface StudentService {

    int insertStudent(Student student);

    int deleteStudentById(int id);

    int updateStudent(Student student);

    int selectCount();

    Student selectStudentById(int id);

    List<Student> selectAllStudents();

}
