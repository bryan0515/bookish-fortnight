package crowdfunding.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.org.apache.regexp.internal.RE;
import crowdfunding.entity.Project;
import crowdfunding.repository.ProjectRepository;
import org.h2.command.dml.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;
import javax.persistence.criteria.From;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/**
 * Created by han on 5/11/17.
 */
@RestController
//@SqlResultSetMapping(name = "SearchResult",
//        entities = {
//                @EntityResult(entityClass = Project.class, fields =
//                @FieldResult(name = "pid", column = "pid"),
//                        @FieldResult(name = "uemail", column = "uemail"),
//                        @FieldResult(name = "pname", column = "pname"),
//                        @FieldResult(name = "pdescription", column = "pdescription"),
//                        @FieldResult(name = "extime", column = "extime"),
//                        @FieldResult(name = "endtime", column = "endtime"),
//                        @FieldResult(name = "minfund", column = "minfund"),
//                        @FieldResult(name = "maxfund", column = "maxfund"),
//                        @FieldResult(name = "status", column = "status")})})
public class SearchController {

    @Autowired
    private EntityManager entityManager;

    @Autowired
    protected ProjectRepository projectRepository;


//    @RequestMapping(value = "/findKeyword", method = RequestMethod.GET)
//    public Collection<Project> findByProject(@Param("keyword")String keyword) {
//        return projectRepository.findProjectsByPdescriptionContaining(keyword);
//    }

//    public List<Object> findByProject(@Param("keyword")String keyword) {
//        Query query = entityManager.createNativeQuery("Select * From Project Where pdescription like ?", "SearchResult");
//        query.setParameter(1, "%" + keyword + "%");
//        return query.getResultList();
//    }



//    @RequestMapping(value = "/test", method = RequestMethod.GET)
//    public List<Object> test() {
//        Query query = entityManager.createNativeQuery("Select * From Project");
//        return query.getResultList();
//    }
}
