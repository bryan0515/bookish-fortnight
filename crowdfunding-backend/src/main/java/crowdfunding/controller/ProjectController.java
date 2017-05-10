package crowdfunding.controller;

import crowdfunding.entity.*;
import crowdfunding.service.CustomerService;
import crowdfunding.service.ProjectService;
import crowdfunding.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import java.util.Date;

/**
 * Created by bryancheng on 2017/5/10.
 */
@RestController
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @Autowired
    private RequestService requestService;

    @Autowired
    private EntityManager entityManager;

    @RequestMapping(value = "/createProject", method = RequestMethod.POST)
    public Long createProject(
            @Param("pname") String pname,
            @Param("pdescription") String pdescription,
            @Param("uemail") String uemail,
            @Param("extime") @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.sss'Z'") Date extime,
            @Param("minfund") int minfund,
            @Param("maxfund") int maxfund) {

        Customer customer = entityManager.find(Customer.class, uemail);

        Project project = new Project(pname, pdescription, customer);

        long pid = projectService.createProject(project);

        RequestId requestId = new RequestId(project, new Date());

        RequestId successRequestId =
                requestService.requestProject(new Request(requestId, extime, extime, minfund, maxfund, RequestStatus.FUNDING));


        return pid;
    }
}
