package crowdfunding.repository;

import crowdfunding.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;
import java.util.List;

/**
 * Created by bryancheng on 2017/5/3.
 */
@RepositoryRestResource
public interface ProjectRepository extends JpaRepository<Project, Long>{
//    List<Project> findByPname(@Param("pname") String name);

//    @Query("SELECT p FROM Project p JOIN Label l WHERE p.pid=l.pid")
//    List<Project> joinLabel();

//    @Query(value="SELECT p FROM Project p WHERE pid = 1")
////            "SELECT p FROM Project p INNER JOIN p.requestId r WHERE r.pid = :pid")
//    Collection<Project> findProjectsByFundingAmount();
//      @Query(value = "SELECT p FROM Project p WHERE p.pname = keyword")
      Collection<Project> findProjectsByPdescriptionContaining(@Param("keyword") String keyword);


//      Collection<Project> findByMinfundGreaterThan(int keyword);

    @Query(value="SELECT p FROM Project p WHERE p.pdescription like CONCAT('%', :search, '%')")
    Collection<Project> searchProjectWithNativeQuery(@Param("search") String search);


}
