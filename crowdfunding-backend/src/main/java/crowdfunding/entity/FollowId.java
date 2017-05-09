package crowdfunding.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * Created by han on 5/6/17.
 */
@Embeddable
public class FollowId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "following")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "follower")
    private Customer follower;

    protected FollowId() {}

    public FollowId(Customer customer, Customer follower) {
        this.customer = customer;
        this.follower = follower;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {

        this.customer = customer;
    }

    public Customer getFollower() {
        return follower;
    }

    public void setFollower(Customer follower) {
        this.follower = follower;
    }

    @Override
    public String toString() {
        return "/search/findFollowsByFollowIdFollowerUemailAndFollowIdCustomerUemail?follower="+follower.getUemail()+"&following="+customer.getUemail();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FollowId followId = (FollowId) o;

        if (customer != null ? !customer.equals(followId.customer) : followId.customer != null) return false;
        return follower != null ? follower.equals(followId.follower) : followId.follower == null;

    }

    @Override
    public int hashCode() {
        int result = customer != null ? customer.hashCode() : 0;
        result = 31 * result + (follower != null ? follower.hashCode() : 0);
        return result;
    }
}
