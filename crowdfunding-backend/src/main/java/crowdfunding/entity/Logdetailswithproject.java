package crowdfunding.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by bryancheng on 2017/5/11.
 */
@Entity
@Table(name = "logdetailswithproject")
public class Logdetailswithproject implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private long lid;
    private String uemail;
    @Temporal(TemporalType.TIMESTAMP)
    private Date savetime;
    private Long pid;
    private String owner;
    private String pname;
    private String pdescription;
    @Temporal(TemporalType.TIMESTAMP)
    private Date extime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date endtime;
    private Long minfund;
    private Long maxfund;
    private String status;

    public Logdetailswithproject(Long lid, String uemail, Date savetime, Long pid, String owner, String pname, String pdescription, Date extime, Date endtime, Long minfund, Long maxfund, String status) {
        this.lid = lid;
        this.uemail = uemail;
        this.savetime = savetime;
        this.pid = pid;
        this.owner = owner;
        this.pname = pname;
        this.pdescription = pdescription;
        this.extime = extime;
        this.endtime = endtime;
        this.minfund = minfund;
        this.maxfund = maxfund;
        this.status = status;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getLid() {
        return lid;
    }

    public void setLid(Long lid) {
        this.lid = lid;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public Date getSavetime() {
        return savetime;
    }

    public void setSavetime(Date savetime) {
        this.savetime = savetime;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
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

    public Long getMinfund() {
        return minfund;
    }

    public void setMinfund(Long minfund) {
        this.minfund = minfund;
    }

    public Long getMaxfund() {
        return maxfund;
    }

    public void setMaxfund(Long maxfund) {
        this.maxfund = maxfund;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
