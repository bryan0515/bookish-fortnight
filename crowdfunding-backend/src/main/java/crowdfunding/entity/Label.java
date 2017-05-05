package crowdfunding.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

@Entity
public class Label {

    @Id
    private String label;

    @ManyToMany(mappedBy = "labels")
    private Collection<Project> projects = new HashSet<>();

    protected Label(){}

    public Label(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
