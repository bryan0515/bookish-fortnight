package crowdfunding.repository;

/**
 * Created by han on 4/30/17.
 */

import crowdfunding.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;
import java.util.List;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, String> {

    //List<Customer> findCustomerByCname(@Param("cname") String cname);
    //Collection<Customer> findCustomerByAddress(@Param("address") String address);
    //List<Customer>
}
