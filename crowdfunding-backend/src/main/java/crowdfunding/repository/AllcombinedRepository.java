package crowdfunding.repository;

import crowdfunding.entity.Allcombined;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;
import java.util.List;

/**
 * Created by bryancheng on 2017/5/11.
 */
@RepositoryRestResource
public interface AllcombinedRepository extends JpaRepository<Allcombined, String>{

    List<Allcombined> getAllcombinedsByPid(@Param("pid") Long pid);

//    @Query(value = "SELECT * FROM Allcombined a WHERE a.pid = :pid", nativeQuery = true)
//    Collection<Allcombined> test(@Param("pid") long pid);

}
