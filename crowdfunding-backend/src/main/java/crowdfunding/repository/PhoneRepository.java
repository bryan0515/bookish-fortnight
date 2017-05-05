package crowdfunding.repository;

import crowdfunding.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by han on 5/5/17.
 */
public interface PhoneRepository extends JpaRepository<Phone, String>{
}
