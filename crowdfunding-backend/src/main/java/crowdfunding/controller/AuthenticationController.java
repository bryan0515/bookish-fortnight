package crowdfunding.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bryancheng on 2017/4/29.
 */
@RestController
public class AuthenticationController {

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public String login() {
        return "Login Page";
    }

//    @RequestMapping(path = "/logout", method = RequestMethod.GET)
//    public String logout() {
//        return "Log out successfully!";
//    }
}
