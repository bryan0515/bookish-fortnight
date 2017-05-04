package crowdfunding.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/**
 * Created by bryancheng on 2017/5/3.
 */

@Embeddable
class LabelId implements Serializable{

    private String Label;
    private long pid;

    protected LabelId(){}

    public LabelId(String label, long pid) {
        Label = label;
        this.pid = pid;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LabelId)) return false;
        LabelId that = (LabelId) o;
        return Objects.equals(getLabel(), that.getLabel()) &&
                Objects.equals(getPid(), that.getPid());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLabel(), getPid());
    }
}

@Entity
public class Label {
    @EmbeddedId
    private LabelId lid;
    @ManyToMany
    @JoinColumn(name = "pid")
    private Collection<Project> projects = new ArrayList<>();

    protected Label(){}

    public Label(LabelId lid, Collection<Project> projects) {
        this.lid = lid;
        this.projects = projects;
    }

    public LabelId getLid() {
        return lid;
    }

    public void setLid(LabelId lid) {
        this.lid = lid;
    }

    public Collection<Project> getProjects() {
        return projects;
    }

    public void setProjects(Collection<Project> projects) {
        this.projects = projects;
    }
}
