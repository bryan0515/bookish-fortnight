package final_project;

/**
 * Created by han on 4/30/17.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationTest {

    private static final Logger log = LoggerFactory.getLogger(ApplicationTest.class);

    public static void main(String[] args) {
        SpringApplication.run(ApplicationTest.class, args);
    }

//    @Bean
//    public CommandLineRunner demo(CustomerRepository repository) {
//        return (args) -> {
//            // save a couple of customers
////            repository.save(new Customer("Jack", "Bauer","1 ave"));
//            repository.save(new Customer("aaa@gmail.com","Chloe", "O'Brian","1 ave"));
//            repository.save(new Customer("aba@gmail.com","Kim", "Bauer","1 ave"));
//            repository.save(new Customer("aea@gmail.com","David", "Palmer","1 ave"));
//            repository.save(new Customer("aka@gmail.com","Michelle", "Dessler","1 ave"));
//
//            // fetch all customers
//            log.info("Customers found with findAll():");
//            log.info("-------------------------------");
//            for (Customer customer : repository.findAll()) {
//                log.info(customer.toString());
//            }
//            log.info("");
//
////             fetch an individual customer by ID
////            Customer customer = repository.findOne(1L);
////            log.info("Customer found with findOne(1L):");
////            log.info("--------------------------------");
////            log.info(customer.toString());
////            log.info("");
//
//            // fetch customers by last name
//            log.info("Customer found with findByLastName('Chloe'):");
//            log.info("--------------------------------------------");
//            for (Customer bauer : repository.findByCname("Chloe")) {
//                log.info(bauer.toString());
//            }
//            log.info("");
//        };
//    }

}
