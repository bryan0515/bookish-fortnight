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
    private Long pid;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date sttime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date extime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date endtime;
    private int minfund;
    private int maxfund;
    private String status;
    private int curfund;
    private String pname;
    private double percentage;
    protected Fundingview() {}

    public Fundingview(Long pid, Date sttime, Date extime, Date endtime, int minfund, int maxfund, String status, int curfund, String pname, double percentage) {
        this.pid = pid;
        this.sttime = sttime;
        this.extime = extime;
        this.endtime = endtime;
        this.minfund = minfund;
        this.maxfund = maxfund;
        this.status = status;
        this.curfund = curfund;
        this.pname = pname;
        this.percentage = percentage;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Date getSttime() {
        return sttime;
    }

    public void setSttime(Date sttime) {
        this.sttime = sttime;
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

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
