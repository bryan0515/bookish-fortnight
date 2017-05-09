package crowdfunding.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
public class Request {

    @EmbeddedId
    private RequestId requestId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date extime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date endtime;
    private int minfund;
    private int maxfund;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private RequestStatus status;

    @OneToMany(mappedBy = "pledgeId.request")
    private Collection<Pledge> pledges;

    protected Request(){}

    public Request(RequestId requestId, Date extime, Date endtime, int minfund, int maxfund, RequestStatus status) {
        this.requestId = requestId;
        this.extime = extime;
        this.endtime = endtime;
        this.minfund = minfund;
        this.maxfund = maxfund;
        this.status = status;
    }

    public RequestId getRequestId() {
        return requestId;
    }

    public void setRequestId(RequestId requestId) {
        this.requestId = requestId;
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

    public RequestStatus getStatus() {
        return status;
    }

    public void setStatus(RequestStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format(
                "Request[pid='%s', sttime='%s', extime='%s', endtime='%s', minfund='%s', maxfund='%s', status='%s']",
                requestId.getProject().getPid(), requestId.getSttime(), extime, endtime, minfund, maxfund, status);
    }
}