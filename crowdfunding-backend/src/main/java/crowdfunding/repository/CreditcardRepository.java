package crowdfunding.repository;

import crowdfunding.entity.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by han on 5/4/17.
 */
public interface CreditcardRepository extends JpaRepository<CreditCard, String> {
}
