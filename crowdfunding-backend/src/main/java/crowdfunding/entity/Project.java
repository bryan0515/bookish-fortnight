package crowdfunding.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by bryancheng on 2017/5/3.
 */
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long pid;
    private String pname;
    private String pdescription;

    @ManyToOne
    @JoinColumn(name = "uemail")
    private Customer customer;

    @OneToMany(mappedBy = "project")
    private Collection<Sample> samples = new HashSet<>();

    @OneToMany(mappedBy = "requestId.project")
    private Collection<Request> requests = new HashSet<>();

    @OneToMany(mappedBy = "projectComment")
    private Set<Comment> comments = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "Project_label",
            joinColumns = @JoinColumn(name = "pid", referencedColumnName = "pid"),
            inverseJoinColumns = @JoinColumn(name = "label",referencedColumnName = "label"))
    private Collection<Label> labels = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "Likes",
            joinColumns = @JoinColumn(name = "pid", referencedColumnName = "pid"),
            inverseJoinColumns = @JoinColumn(name = "uemail",referencedColumnName = "uemail"))
    private Set<Customer> customers = new HashSet<>();


    protected Project(){}

    public Project(String pname, String pdescription, Customer customer) {
        this.pname = pname;
        this.pdescription = pdescription;
        this.customer = customer;
    }

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

//    public String getUemail() {
//        return uemail;
//    }
//
//    public void setUemail(String uemail) {
//        this.uemail = uemail;
//    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPdescription() {
        return pdescription;
    }

    public void setPdescription(String pdescription) {
        this.pdescription = pdescription;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }
}
