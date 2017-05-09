package crowdfunding.entity;

import javax.persistence.*;

/**
 * Created by bryancheng on 2017/5/5.
 */
@Entity
public class Pledge {

    @EmbeddedId
    private PledgeId pledgeId;
    //TODO: Map to customer_credit_card
    @ManyToOne
    @JoinColumn(name = "credit_card")
    private CreditCard credit_card;
    private float amount;

    protected Pledge() {}

    public Pledge(PledgeId pledgeId, CreditCard credit_card, float amount) {
        this.pledgeId = pledgeId;
        this.credit_card = credit_card;
        this.amount = amount;
    }

    public PledgeId getPledgeId() {
        return pledgeId;
    }

    public void setPledgeId(PledgeId pledgeId) {
        this.pledgeId = pledgeId;
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

    @Override
    public String toString() {
        return "Pledge{" +
                "pledgeId=" + pledgeId +
                ", credit_card=" + credit_card +
                ", amount=" + amount +
                '}';
    }
}
