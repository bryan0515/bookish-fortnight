package crowdfunding.controller;

import crowdfunding.entity.*;
import crowdfunding.service.PledgeService;
import crowdfunding.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import java.util.*;

/**
 * Created by han on 5/9/17.
 */
@RestController
public class PledgeController {

    @Autowired
    private PledgeService pledgeService;

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private ProjectService projectService;


    @RequestMapping(value = "/createPledge", method = RequestMethod.POST)
    @ResponseBody
    public void register(@Param("pid")Long pid, @Param("amount")Float amount, @Param("uemail")String uemail) {

        Customer user = entityManager.find(Customer.class, uemail);

        Set<CreditCard> cards = user.getCreditcards();

        Project project = entityManager.find(Project.class, pid);

        CreditCard card = cards.iterator().next();

//        for (CreditCard c : cards) {
//            card = c;
//            break;
//        }

        pledgeService.addPledge(new Pledge(project,user,card,amount));

//        public List findA(String name) {
//        return entityManager.createQuery("SELECT p FROM Project p Where p.pname = pname");
//        }
//        List<Integer> findWithName = entityManager.createNamedQuery("findProjectWithName").setParameter("pid","pname").getResultList();
//        int pid = 0;
//        for(int p : findWithName) {
//            pid = p;
//        }
//
//        //Project project = entityManager.find(Project.class, pname);
//        Request request = entityManager.find(Request.class, pid);
//        Pledge pledge = entityManager.find(Pledge.class, request.getRequestId());

//        return pledgeService.addPledge(new Pledge(pledge.getPledgeId(),card,amount));
//        return "success";
//    return "";
    }

}
