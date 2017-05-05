package student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import student.entity.Student;

import javax.sql.DataSource;

@SpringBootApplication
public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

//    @Bean
//    public CommandLineRunner demo(CustomerRepository repository) {
//        return (args) -> {
//            // save a couple of customers
//            repository.save(new Student("Said", "Computer Science"));
//            repository.save(new Student("Alex U", "Finance"));
//            repository.save(new Student("Anna", "Maths"));
//            repository.save(new Student("Jack", "Electrical Engineering"));
//            repository.save(new Student("Michelle", "Finance"));
//
//            // fetch all Students
//            log.info("Students found with findAll():");
//            log.info("-------------------------------");
//            for (Student Student : repository.findAll()) {
//                log.info(Student.toString());
//            }
//            log.info("");
//
//            // fetch an individual Student by ID
//            Student Student = repository.findOne(1L);
//            log.info("Student found with findOne(1L):");
//            log.info("--------------------------------");
//            log.info(Student.toString());
//            log.info("");
//
//            // fetch Students by last name
//            log.info("Student found with findByLastName('Bauer'):");
//            log.info("--------------------------------------------");
//            for (Student bauer : repository.findByName("Bauer")) {
//                log.info(bauer.toString());
//            }
//            log.info("");
//        };
//    }
}
