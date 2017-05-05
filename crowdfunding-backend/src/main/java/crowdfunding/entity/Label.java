package crowdfunding.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Label {

    @EmbeddedId
    private LabelId labelId;

//    @ManyToOne
//    @JoinColumn(name = "pid")
//    private Project project;

    protected Label(){}

    public Label(LabelId labelId) {
        this.labelId = labelId;
    }

    public LabelId getLabelId() {
        return labelId;
    }

    public void setLabelId(LabelId labelId) {
        this.labelId = labelId;
    }
}
