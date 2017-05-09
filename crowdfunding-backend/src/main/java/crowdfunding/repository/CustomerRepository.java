package crowdfunding.repository;

/**
 * Created by han on 4/30/17.
 */

import crowdfunding.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, String> {

//    List<Customer> findByCname(String cname);
    //List<Customer>
}
