package crowdfunding.entity;
/**
 * Created by han on 5/5/17.
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;
@Entity
public class Phone {
    @Id
    private String phone;

    @ManyToMany(mappedBy = "phones")
    private Set<Customer> customer = new HashSet<>();

    protected Phone() {};

    public Phone(String phone, Set<Customer> customer) {
        this.phone = phone;
        this.customer = customer;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set<Customer> getCustomer_phone() {
        return customer;
    }

    public void setCustomer_phone(Set<Customer> customer) {
        this.customer = customer;
    }
}
