package crowdfunding.entity;

import javax.persistence.*;

/**
 * Created by bryancheng on 2017/5/5.
 */
@Entity
public class Pledge {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long pledgeId;
//    private Long pid;
//    private String uemail;

    @ManyToOne
    @JoinColumn(name = "pid")
    private Project project;

    @ManyToOne
    @JoinColumn(name = "uemail")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "credit_card")
    private CreditCard credit_card;

    private float amount;

    protected Pledge() {}

    public Pledge(Project project, Customer customer, CreditCard credit_card, float amount) {
        this.project = project;
        this.customer = customer;
        this.credit_card = credit_card;
        this.amount = amount;
    }

    public Long getPledgeId() {
        return pledgeId;
    }

    public void setPledgeId(Long pledgeId) {
        this.pledgeId = pledgeId;
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

    public CreditCard getCredit_card() {
        return credit_card;
    }

    public void setCredit_card(CreditCard credit_card) {
        this.credit_card = credit_card;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
//    @Override
//    public String toString() {
//        return "Pledge{" +
//                "pledgeId=" + pledgeId +
//                ", credit_card=" + credit_card +
//                ", amount=" + amount +
//                '}';
//    }
}
