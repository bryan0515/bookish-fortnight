package crowdfunding.repository;

import crowdfunding.entity.Customer;
import crowdfunding.entity.FollowId;
import crowdfunding.entity.Follows;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;

/**
 * Created by han on 5/5/17.
 */
@RepositoryRestResource
public interface FollowsRepository extends JpaRepository<Follows, FollowId> {

    Collection<Follows> findFollowsByFollowIdFollowerUemailAndFollowIdCustomerUemail(
            @Param("follower") String follower,
            @Param("following") String following);
}
