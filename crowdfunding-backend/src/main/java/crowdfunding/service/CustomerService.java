package crowdfunding.service;

import crowdfunding.entity.Customer;
import crowdfunding.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by bryancheng on 2017/5/9.
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public String registerCustomer(Customer customer) {
        customerRepository.save(customer);
        return customer.getUemail();
    }
}
