package student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import student.dao.StudentDao;
import student.entity.Student;

import java.util.Collection;

/**
 * Created by bryancheng on 2017/4/12.
 */
@Service
public class StudentService {

    @Autowired
    @Qualifier("FakeData")
    private StudentDao studentDao;

    public Collection<Student> getAllStudents() {
        return this.studentDao.getAllStudents();
    }

    public Student getStudentById(int id) { return this.studentDao.getStudentById(id); }

    public void deleteStudentById(int id) {
        this.studentDao.deleteStudentById(id);
    }

    public void updateStudent(Student student) {
        this.studentDao.undateStudent(student);
    }

    public void insertStudent(Student student) {
        this.studentDao.insertStudentToDB(student);
    }
}
