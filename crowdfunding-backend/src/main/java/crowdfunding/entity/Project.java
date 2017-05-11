package crowdfunding.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
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
    @Temporal(TemporalType.TIMESTAMP)
    private Date extime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date endtime;
    private float minfund;
    private float maxfund;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private ProjectStatus status;

    @ManyToOne
    @JoinColumn(name = "uemail")
    private Customer customer;

    @OneToMany(mappedBy = "project")
    private Collection<Sample> samples = new HashSet<>();

    @OneToMany(mappedBy = "project")
    private Collection<Pledge> pledges = new HashSet<>();

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

    public Project(String pname, String pdescription, Date extime, Date endtime, float minfund, float maxfund, ProjectStatus status, Customer customer) {
        this.pname = pname;
        this.pdescription = pdescription;
        this.extime = extime;
        this.endtime = endtime;
        this.minfund = minfund;
        this.maxfund = maxfund;
        this.status = status;
        this.customer = customer;
    }

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

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

    public Date getExtime() {
        return extime;
    }

    public void setExtime(Date extime) {
        this.extime = extime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public float getMinfund() {
        return minfund;
    }

    public void setMinfund(float minfund) {
        this.minfund = minfund;
    }

    public float getMaxfund() {
        return maxfund;
    }

    public void setMaxfund(float maxfund) {
        this.maxfund = maxfund;
    }

    public ProjectStatus getStatus() {
        return status;
    }

    public void setStatus(ProjectStatus status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Collection<Sample> getSamples() {
        return samples;
    }

    public void setSamples(Collection<Sample> samples) {
        this.samples = samples;
    }

    public Collection<Pledge> getPledges() {
        return pledges;
    }

    public void setPledges(Collection<Pledge> pledges) {
        this.pledges = pledges;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Collection<Label> getLabels() {
        return labels;
    }

    public void setLabels(Collection<Label> labels) {
        this.labels = labels;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }
}
