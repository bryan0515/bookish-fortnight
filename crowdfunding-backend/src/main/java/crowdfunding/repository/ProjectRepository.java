package crowdfunding.repository;

import crowdfunding.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by bryancheng on 2017/5/3.
 */
@RepositoryRestResource
public interface ProjectRepository extends JpaRepository<Project, Long>{
    List<Project> findByPname(@Param("pname") String name);

//    @Query("SELECT p FROM Project p JOIN Label l WHERE p.pid=l.pid")
//    List<Project> joinLabel();
}