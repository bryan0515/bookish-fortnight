package crowdfunding.controller;

import crowdfunding.entity.Customer;
import crowdfunding.entity.Project;
import crowdfunding.entity.ProjectStatus;
import crowdfunding.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Date;
import java.util.List;

/**
 * Created by bryancheng on 2017/5/10.
 */
@RestController
public class ProjectController {
    @Autowired
    private ProjectService projectService;

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

        Project project = new Project(pname, pdescription, extime, extime, minfund, maxfund, ProjectStatus.FUNDING, customer);

        return projectService.createProject(project);
    }

    @RequestMapping(value = "/testing", method = RequestMethod.GET)
    public List<Object> test() {
        Query query = entityManager.createNativeQuery("SELECT * FROM Customer NATURAL JOIN Pledge");
        return query.getResultList();
    }

    @RequestMapping(value = "/getProjectPledgesWithFonder", method = RequestMethod.GET)
    public List<Object> getProjectPledgesWithFonder(@Param("pid") Long pid) {
        Query query = entityManager.createNativeQuery(
                "SELECT p.pid, p.amount, c.cname FROM Pledge p JOIN Customer c WHERE p.pid = ? AND p.uemail=c.uemail");
        query.setParameter(1, pid);
        return query.getResultList();
    }

//    @RequestMapping(value = "/likeProject", method = RequestMethod.POST)
//    public boolean likeProject(@Param("pid") long pid, @Param("uemail")String uemail) {
//
//    }

}
