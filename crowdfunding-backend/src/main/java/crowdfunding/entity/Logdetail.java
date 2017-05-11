package crowdfunding.entity;

import sun.rmi.runtime.Log;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by han on 5/11/17.
 */
@Entity
public class Logdetail {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long lid;
    @ManyToOne
    @JoinColumn(name = "pid")
    private Project project;

    @ManyToOne
    @JoinColumn(name = "uemail")
    private Customer customer;


    @Temporal(TemporalType.TIMESTAMP)
    private Date savetime;

    protected Logdetail() {}

    public Logdetail(Project project, Customer customer) {
        this.project = project;
        this.customer = customer;
        this.savetime = new Date();
    }

    public Long getLid() {
        return lid;
    }

    public void setLid(Long lid) {
        this.lid = lid;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getSavetime() {
        return savetime;
    }

    public void setSavetime(Date savetime) {
        this.savetime = savetime;
    }
}
