package crowdfunding.repository;

import crowdfunding.entity.Logdetailswithproject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by bryancheng on 2017/5/11.
 */
@RepositoryRestResource
public interface LogdetailswithprojectRepository extends JpaRepository<Logdetailswithproject, Long>{
    List<Logdetailswithproject> getAllByUemail(@Param("uemail") String uemail);
}
