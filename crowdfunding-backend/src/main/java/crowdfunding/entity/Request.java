package crowdfunding.entity;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * Created by bryancheng on 2017/5/4.
 */
public class Request {
    @Temporal(TemporalType.TIMESTAMP)
    private Date sttime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date extime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date endtime;
    private int minfund;
    private int maxfund;
    @Enumerated(EnumType.STRING)
    private Status status;
}

enum Status {
    SUCCESS,
    FUNDING,
    FAILED
}
