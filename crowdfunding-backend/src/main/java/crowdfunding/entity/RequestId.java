package crowdfunding.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by bryancheng on 2017/5/5.
 */
@Embeddable
public class RequestId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "pid")
    private Project project;

    @Temporal(TemporalType.TIMESTAMP)
    private Date sttime;

    protected RequestId(){}

    public RequestId(Project project, Date sttime) {
        this.project = project;
        this.sttime = sttime;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Date getSttime() {
        return sttime;
    }

    public void setSttime(Date sttime) {
        this.sttime = sttime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RequestId requestId = (RequestId) o;

        if (project != null ? !project.equals(requestId.project) : requestId.project != null) return false;
        return sttime != null ? sttime.equals(requestId.sttime) : requestId.sttime == null;
    }

    @Override
    public int hashCode() {
        int result = project != null ? project.hashCode() : 0;
        result = 31 * result + (sttime != null ? sttime.hashCode() : 0);
        return result;
    }
}
