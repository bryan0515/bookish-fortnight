package crowdfunding.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by bryancheng on 2017/5/11.
 */
@Entity
public class Allcombined {
    @Id
    private String uemail;
    private String cname;
    private String password;
    private String address;
    private Long pid;
    private String pname;
    private String pdescription;
    @Temporal(TemporalType.TIMESTAMP)
    private Date extime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date endtime;
    private Integer minfund;
    private Integer maxfund;
    private String status;
    private Long pledgeId;
    private String plUemail;
    private String creditCard;
    private Integer amount;
    private Integer rate;

    protected Allcombined(){}

    public Allcombined(String uemail, String cname, String password, String address, Long pid, String pname, String pdescription, Date extime, Date endtime, Integer minfund, Integer maxfund, String status, Long pledgeId, String plUemail, String creditCard, Integer amount, Integer rate) {
        this.uemail = uemail;
        this.cname = cname;
        this.password = password;
        this.address = address;
        this.pid = pid;
        this.pname = pname;
        this.pdescription = pdescription;
        this.extime = extime;
        this.endtime = endtime;
        this.minfund = minfund;
        this.maxfund = maxfund;
        this.status = status;
        this.pledgeId = pledgeId;
        this.plUemail = plUemail;
        this.creditCard = creditCard;
        this.amount = amount;
        this.rate = rate;
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

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
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

    public Integer getMinfund() {
        return minfund;
    }

    public void setMinfund(Integer minfund) {
        this.minfund = minfund;
    }

    public Integer getMaxfund() {
        return maxfund;
    }

    public void setMaxfund(Integer maxfund) {
        this.maxfund = maxfund;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getPledgeId() {
        return pledgeId;
    }

    public void setPledgeId(Long pledgeId) {
        this.pledgeId = pledgeId;
    }

    public String getPlUemail() {
        return plUemail;
    }

    public void setPlUemail(String plUemail) {
        this.plUemail = plUemail;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }
}
