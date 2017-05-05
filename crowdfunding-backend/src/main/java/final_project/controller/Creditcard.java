package final_project.controller;

/**
 * Created by han on 5/3/17.
 */

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
//@Table(name = "creditcard")
public class CreditCard {

    //@GeneratedValue(strategy= GenerationType.AUTO)
    //@Column(name = "uemail", columnDefinition = "VARCHAR(40) default null ")
//    private String uemail;
    @Id
    @Column(name = "credit_card")
    private String credit_card;

    @ManyToMany(mappedBy = "creditcards")
    private Set<Customer> customer = new HashSet<>();


    protected CreditCard() {}

    public CreditCard(String creditcard, Set<Customer> customer) {
        this.credit_card = creditcard;
        this.customer = customer;
    }

    public String getCreditcard() {
        return credit_card;
    }

    public void setCreditcard(String creditcard) {
        this.credit_card = creditcard;
    }

    public Set<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(Set<Customer> customer) {
        this.customer = customer;
    }

    //    public CreditCard(String creditcard) {
//        this.creditcard = creditcard;
//    }
//
//    public CreditCard(String creditcard, Customer customer) {
//        this.creditcard = creditcard;
//        this.customer = customer;
//    }
//
//    @Id
//    public String getUemail() {
//        return uemail;
//    }
//    public void setUemail(String uemail) {
//        this.uemail =  uemail;
//    }
//    public String getCreditcard() {
//        return creditcard;
//    }
//    public void setCreditcard(String creditcard) {
//        this.creditcard =  creditcard;
//    }
//
//   @ManyToOne
////   @JoinColumn(name = "customr_euemail")
//   @JoinColumn(name = "uemail")
//   public Customer getCustomer() {
//       return customer;
//   }
}
