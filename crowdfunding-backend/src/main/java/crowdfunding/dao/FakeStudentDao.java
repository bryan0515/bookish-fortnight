package crowdfunding.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * Created by bryancheng on 2017/4/12.
 */
@Repository
@Qualifier("FakeData")
public class FakeStudentDao implements StudentDao {
//    private static Map<Long, Student> students;
//
//    static {
//        students = new HashMap<Long, Student>() {
//            {
//                put(1L, new Student(1, "Said", "Computer Science"));
//                put(2L, new Student(2, "Alex U", "Finance"));
//                put(3L, new Student(3, "Anna", "Maths"));
//            }
//        };
//    }
//
//    @Override
//    public Collection<Student> getAllStudents(){
//        return students.values();
//    }
//
//    @Override
//    public Student getStudentById(int id) { return students.get(id); }
//
//    @Override
//    public void deleteStudentById(int id) {
//        students.remove(id);
//    }
//
//    @Override
//    public void updateStudent(Student student) {
//
//
//    }
//
//    @Override
//    public void insertStudentToDB(Student student) {
//        students.put(student.getId(), student);
//    }
}
