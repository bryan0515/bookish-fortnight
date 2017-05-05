package crowdfunding.repository;

import crowdfunding.entity.Customer;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by bryancheng on 2017/5/3.
 */
public class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void baseTest () throws Exception {
        Customer customer = new Customer(
                "jay@gmail.com",
                "Jay",
                "123456",
                "somewhere");
        customerRepository.save(customer);
    }
}
