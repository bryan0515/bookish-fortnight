package crowdfunding.controller;

import com.sun.org.apache.regexp.internal.RE;
import crowdfunding.entity.CreditCard;
import crowdfunding.entity.Pledge;
import crowdfunding.entity.PledgeId;
import crowdfunding.service.PledgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by han on 5/9/17.
 */
@RestController
public class PledgeController {

    @Autowired
    private PledgeService pledgeService;

    @RequestMapping(value = "/createPledge", method = RequestMethod.POST)
    @ResponseBody
    public String register(@Param("pname")String pname, @Param("amount")float amount) {
//        return pledgeService.addPledge(new Pledge(pname,amount));
        return "success";
    }
}
