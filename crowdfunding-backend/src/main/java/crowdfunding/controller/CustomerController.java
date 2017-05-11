package crowdfunding.controller;

import crowdfunding.entity.Customer;
import crowdfunding.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

/**
 * Created by bryancheng on 2017/5/9.
 */
@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value="/register", method = RequestMethod.POST)
    @ResponseBody
    public String register(@Param("uemail") String uemail, @Param("cname") String cname, @Param("password") String password, @Param("address") String address){
        return customerService.registerCustomer(new Customer(uemail, cname, password, address));
    }
}
