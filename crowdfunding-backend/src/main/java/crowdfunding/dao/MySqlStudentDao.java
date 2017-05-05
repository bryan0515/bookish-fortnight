package crowdfunding.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import crowdfunding.entity.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by bryancheng on 2017/4/12.
 */
@Repository("mysql")
public class MySqlStudentDao implements StudentDao {

//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    private static class StudentRowMapper implements RowMapper<Student> {
//        @Override
//        public Student mapRow(ResultSet resultSet, int i) throws SQLException {
//            return new Student(
//                    resultSet.getInt("id"),
//                    resultSet.getString("name"),
//                    resultSet.getString("course"));
//        }
//    }
//
//    public Collection<Student> getAllStudents() {
//        final String query = "SELECT * FROM Student";
//        return jdbcTemplate.query(query, new StudentRowMapper());
//    }
//
//
//    public Student getStudentById(int id) {
//        final String query = "SELECT * FROM Student WHERE id = ?";
//        return jdbcTemplate.queryForObject(query, new StudentRowMapper(), id);
//    }
//
//
//    public void deleteStudentById(int id) {
//        final String query = "DELETE FROM student WHERE id = ?";
//        jdbcTemplate.update(query, id);
//    }
//
//
//    public void updateStudent(Student student) {
//        final String query = "UPDATE Student SET name = ?, course = ? WHERE id = ?";
//        final long id = student.getId();
//        final String name = student.getName();
//        final String course = student.getCourse();
//        jdbcTemplate.update(query, new Object[] {name, course, id});
//    }
//
//
//    public void insertStudentToDB(Student student) {
//        final String query = "INSERT INTO students (name, course) VALUES (?, ?)";
//        final String name = student.getName();
//        final String course = student.getCourse();
//        jdbcTemplate.update(query, new Object[] {name, course});
//    }
}
