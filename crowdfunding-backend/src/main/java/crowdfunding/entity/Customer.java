package crowdfunding.entity;

/**
 * Created by han on 5/3/17.
 */

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Customer {
    //@Id
    //@GeneratedValue(strategy= GenerationType.AUTO)
//    @Column(name = "uemail", columnDefinition = "VARCHAR(40) default null ")
    @Id
    private String uemail;
    private String cname;
    private String password;
    private String address;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Customer_credit_card", joinColumns = @JoinColumn(name = "uemail", referencedColumnName = "uemail"),inverseJoinColumns = @JoinColumn(name = "credit_card",referencedColumnName = "credit_card"))
    private Set<CreditCard> creditcards = new HashSet<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Customer_interest", joinColumns = @JoinColumn(name = "uemail", referencedColumnName = "uemail"),inverseJoinColumns = @JoinColumn(name = "interest",referencedColumnName = "interest"))
    private Set<Interest> interests = new HashSet<>();;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Customer_phone", joinColumns = @JoinColumn(name = "uemail", referencedColumnName = "uemail"),inverseJoinColumns = @JoinColumn(name = "phone",referencedColumnName = "phone"))
    private Set<Phone> phones = new HashSet<>();

    @OneToMany(mappedBy = "customer")
    private Collection<Pledge> pledges;

    @OneToMany(mappedBy = "followId.customer")
    private Set<Follows> follows;

    @OneToMany(mappedBy = "followId.follower")
    private Set<Follows> follower;

    @OneToMany(mappedBy = "customer")
    private Set<Project> projects;

    @ManyToMany(mappedBy = "customers")
    private Set<Project> projectsLike;

    @OneToMany(mappedBy = "customerComment")
    private Set<Comment> comments;

    protected Customer() {}

    public Customer(String uemail, String cname, String password, String address) {
        this.uemail = uemail;
        this.cname = cname;
        this.password = password;
        this.address = address;
        this.creditcards = new HashSet<>();
        this.interests = new HashSet<>();
        this.phones = new HashSet<>();
        this.follows = new HashSet<>();
        this.follower = new HashSet<>();
        this.projects = new HashSet<>();
        this.projectsLike = new HashSet<>();
        this.comments = new HashSet<>();
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<CreditCard> getCreditcards() {
        return creditcards;
    }

    public void setCreditcards(Set<CreditCard> creditcards) {
        this.creditcards = creditcards;
    }

    public Set<Interest> getInterests() {
        return interests;
    }

    public void setInterests(Set<Interest> interests) {
        this.interests = interests;
    }

    public Set<Phone> getPhones() {
        return phones;
    }

    public void setPhones(Set<Phone> phones) {
        this.phones = phones;
    }

    public Set<Follows> getFollows() {
        return follows;
    }

    public void setFollows(Set<Follows> follows) {
        this.follows = follows;
    }

    public Set<Follows> getFollower() {
        return follower;
    }

    public void setFollower(Set<Follows> follower) {
        this.follower = follower;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    public Set<Project> getProjectsLike() {
        return projectsLike;
    }

    public void setProjectsLike(Set<Project> projectsLike) {
        this.projectsLike = projectsLike;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    //    @Override
//    public String toString() {
////        return String.format(
////                "Customer[uemail=%s, cname='%s', password='%s', addess='%s']",
////                uemail, cname, password, address);
////        return "uemail " + uemail + "cname "+ cname + "creditcard:" + ((getCredictCard() == null) ? null : getCredictCard()) ;
//        return "uemail " + uemail + " cname "+ cname;
//    }
}
