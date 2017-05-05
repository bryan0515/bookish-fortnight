package crowdfunding.entity;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by bryancheng on 2017/5/3.
 */

@Embeddable
public class LabelId implements Serializable {

    private String Label;

    @ManyToOne
    @JoinColumn(name = "pid")
    private Project project;

    protected LabelId(){}

    public LabelId(String label, Project project) {
        Label = label;
        this.project = project;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LabelId)) return false;
        LabelId that = (LabelId) o;
        return Objects.equals(getLabel(), that.getLabel()) &&
                Objects.equals(getProject(), that.getProject());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLabel(), getProject());
    }

}
