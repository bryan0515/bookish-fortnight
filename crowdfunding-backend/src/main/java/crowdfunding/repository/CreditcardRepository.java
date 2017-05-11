package crowdfunding.repository;

import crowdfunding.entity.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by han on 5/4/17.
 */
@RepositoryRestResource
public interface CreditcardRepository extends JpaRepository<CreditCard, String> {
}
