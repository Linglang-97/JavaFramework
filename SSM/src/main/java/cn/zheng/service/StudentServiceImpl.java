package cn.zheng.service;

import cn.zheng.dao.StudentDao;
import cn.zheng.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public int insertStudent(Student student) {
        return studentDao.insertStudent(student);
    }

    @Override
    public int deleteStudentById(int id) {
        return studentDao.deleteStudentById(id);
    }

    @Override
    public int updateStudent(Student student) {
        return studentDao.updateStudent(student);
    }

    @Override
    public int selectCount() {
        return studentDao.selectCount();
    }

    @Override
    public Student selectStudentById(int id) {
        return studentDao.selectStudentById(id);
    }

    @Override
    public List<Student> selectAllStudents() {
        return studentDao.selectAllStudents();
    }

}
