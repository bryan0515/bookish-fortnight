package crowdfunding.repository;

import crowdfunding.entity.Allcombined;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by bryancheng on 2017/5/11.
 */
public interface AllcombinedRepository extends JpaRepository<Allcombined, String>{

    List<Allcombined> getAllByPid(@Param("pid") Long pid);

}
