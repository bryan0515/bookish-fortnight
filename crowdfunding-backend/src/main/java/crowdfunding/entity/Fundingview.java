package crowdfunding.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by han on 5/9/17.
 */
@Entity
@Table(name = "fundingrequest")
public class Fundingview implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    private Long pledge_id;

    @NotNull
    private Long pid;
    @Temporal(TemporalType.TIMESTAMP)
    private Date extime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date endtime;
    private int minfund;
    private int maxfund;
    private String status;
    private int curfund;
    private String pname;
    private String pdescription;
    private double percentage;
    protected Fundingview() {}

    public Fundingview(Long pledge_id, Long pid, Date extime, Date endtime, int minfund, int maxfund, String status, int curfund, String pname, String pdescription, double percentage) {
        this.pledge_id = pledge_id;
        this.pid = pid;
        this.extime = extime;
        this.endtime = endtime;
        this.minfund = minfund;
        this.maxfund = maxfund;
        this.status = status;
        this.curfund = curfund;
        this.pname = pname;
        this.pdescription = pdescription;
        this.percentage = percentage;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getPledge_id() {
        return pledge_id;
    }

    public void setPledge_id(Long pledge_id) {
        this.pledge_id = pledge_id;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
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

    public int getMinfund() {
        return minfund;
    }

    public void setMinfund(int minfund) {
        this.minfund = minfund;
    }

    public int getMaxfund() {
        return maxfund;
    }

    public void setMaxfund(int maxfund) {
        this.maxfund = maxfund;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCurfund() {
        return curfund;
    }

    public void setCurfund(int curfund) {
        this.curfund = curfund;
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

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
