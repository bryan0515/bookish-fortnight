package crowdfunding.entity;

/**
 * Created by han on 5/3/17.
 */

import javax.persistence.*;
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
    private Set<Interest> interests = new HashSet<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Customer_phone", joinColumns = @JoinColumn(name = "uemail", referencedColumnName = "uemail"),inverseJoinColumns = @JoinColumn(name = "phone",referencedColumnName = "phone"))
    private Set<Phone> phones = new HashSet<>();

    protected Customer() {}

    public Customer(String uemail, String cname, String password, String address, Set<CreditCard> creditcards, Set<Interest> interests, Set<Phone> phones) {
        this.uemail = uemail;
        this.cname = cname;
        this.password = password;
        this.address = address;
        this.creditcards = creditcards;
        this.interests = interests;
        this.phones = phones;
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
    //    @OneToMany(mappedBy = "customer")
//    private Set<CreditCard> creditCards = new HashSet<>();
//
//    protected Customer() {}
//
//    public Customer(String uemail, String cname, String password, String address, Set<CreditCard> creditCards) {
//        this.uemail = uemail;
//        this.cname = cname;
//        this.password = password;
//        this.address = address;
//        this.creditCards = creditCards;
//    }


    @Override
    public String toString() {
//        return String.format(
//                "Customer[uemail=%s, cname='%s', password='%s', addess='%s']",
//                uemail, cname, password, address);
//        return "uemail " + uemail + "cname "+ cname + "creditcard:" + ((getCredictCard() == null) ? null : getCredictCard()) ;
        return "uemail " + uemail + " cname "+ cname;
    }
}
