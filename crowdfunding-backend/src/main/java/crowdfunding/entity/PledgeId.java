package crowdfunding.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by bryancheng on 2017/5/5.
 */
@Embeddable
public class PledgeId implements Serializable {

    private static final long serialVersionUID = 1L;

    @MapsId("requestId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "pid"),
            @JoinColumn(name = "sttime")
    })
    private Request request;

    @ManyToOne
    @JoinColumn(name = "uemail")
    private Customer customer;

    @Temporal(TemporalType.TIMESTAMP)
    private Date pledgetime;

    protected PledgeId() {
    }

    public PledgeId(Request request, Customer customer, Date pledgetime) {
        this.request = request;
        this.customer = customer;
        this.pledgetime = pledgetime;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getPledgetime() {
        return pledgetime;
    }

    public void setPledgetime(Date pledgetime) {
        this.pledgetime = pledgetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PledgeId pledgeId = (PledgeId) o;

        if (request != null ? !request.equals(pledgeId.request) : pledgeId.request != null) return false;
        if (customer != null ? !customer.equals(pledgeId.customer) : pledgeId.customer != null) return false;
        return pledgetime != null ? pledgetime.equals(pledgeId.pledgetime) : pledgeId.pledgetime == null;
    }

    @Override
    public int hashCode() {
        int result = request != null ? request.hashCode() : 0;
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        result = 31 * result + (pledgetime != null ? pledgetime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PledgeId{" +
                "request=" + request +
                ", customer=" + customer +
                ", pledgetime=" + pledgetime +
                '}';
    }
}
