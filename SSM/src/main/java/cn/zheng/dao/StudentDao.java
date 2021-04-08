package cn.zheng.dao;

import cn.zheng.domain.Student;

import java.util.List;

public interface StudentDao {

    int insertStudent(Student student);

    int deleteStudentById(int id);

    int updateStudent(Student student);

    int selectCount();

    Student selectStudentById(int id);

    List<Student> selectAllStudents();

}
