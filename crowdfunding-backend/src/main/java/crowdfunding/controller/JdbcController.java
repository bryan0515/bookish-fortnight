package crowdfunding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bryancheng on 2017/5/11.
 */
@RestController
public class JdbcController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/likeProject", method = RequestMethod.POST)
    public void likeProject(@Param("pid") long pid, @Param("uemail")String uemail) {
        jdbcTemplate.update("INSERT INTO `Likes` VALUES (?, ?)", new Object[] {pid, uemail});
    }
}
