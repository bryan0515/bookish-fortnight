package crowdfunding.repository;

import crowdfunding.entity.Interest;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by han on 5/4/17.
 */
public interface InterestRepository extends JpaRepository<Interest, String> {
}
