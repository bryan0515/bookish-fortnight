package crowdfunding.repository;

import crowdfunding.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by bryancheng on 2017/5/3.
 */
@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, String>{
}
