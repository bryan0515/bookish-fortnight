package crowdfunding.controller;

import org.springframework.web.bind.annotation.*;

import java.security.Principal;

/**
 * Created by bryancheng on 2017/4/29.
 */
@RestController
public class AuthenticationController {

    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
//    @CrossOrigin(origins = "http://localhost:9000")
////    @RequestMapping(path = "/login", method = RequestMethod.GET)
//    @GetMapping("/greeting")
//    public String login() {
//        return "Login Page";
//    }

//    @RequestMapping(path = "/logout", method = RequestMethod.GET)
//    public String logout() {
//        return "Log out successfully!";
//    }
}
