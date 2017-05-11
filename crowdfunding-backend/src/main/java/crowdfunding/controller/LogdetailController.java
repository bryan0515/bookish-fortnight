package crowdfunding.controller;

import crowdfunding.entity.*;
import crowdfunding.service.LogdetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;

/**
 * Created by han on 5/11/17.
 */
@RestController
public class LogdetailController {

    @Autowired
    private LogdetailService logdetailService;

    @Autowired
    private EntityManager entityManager;


    @RequestMapping(value = "/getLog", method = RequestMethod.POST)
    @ResponseBody
    public void register(@Param("pid")Long pid, @Param("uemail")String uemail) {
        Customer user = entityManager.find(Customer.class, uemail);
        Project project = entityManager.find(Project.class, pid);

        logdetailService.addLogdetail(new Logdetail(project,user));
    }
}
