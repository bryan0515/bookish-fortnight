package crowdfunding.entity;

import crowdfunding.entity.Customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by han on 5/4/17.
 */
@Entity
public class Interest {
    @Id
    @Column(name = "interest")
    private String interest;

    @ManyToMany(mappedBy = "interests")
    private Set<Customer> customer = new HashSet<>();


    protected Interest() {}

    public Interest(String interest, Set<Customer> customer) {
        this.interest = interest;
        this.customer = customer;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public Set<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(Set<Customer> customer) {
        this.customer = customer;
    }
}
