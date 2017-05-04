package student.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by bryancheng on 2017/4/12.
 */
@Entity
//@Table(name = "Student", catalog = "College")
public class Student {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String course;

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public Student(long id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    protected Student() {}

    @Override
    public String toString() {
        return String.format(
                "Student[id=%d, name='%s', course='%s']",
                id, name, course);
    }


    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
