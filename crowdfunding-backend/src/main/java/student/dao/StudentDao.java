package student.dao;

import student.entity.Student;

import java.util.Collection;

/**
 * Created by bryancheng on 2017/4/12.
 */
public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void deleteStudentById(int id);

    void undateStudent(Student student);

    void insertStudentToDB(Student student);
}
