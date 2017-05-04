package crowdfunding.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;

/**
 * Created by bryancheng on 2017/5/3.
 */
@Entity
public class Project {
    @Id
    @GeneratedValue
    private long pid;
    private String uemail;
    private String pname;
    private String pdescription;

    @OneToMany(mappedBy = "project")
    private Collection<Sample> samples = new HashSet<>();

    @ManyToMany
    @JoinColumn(name = "pid")
    private Collection<Label> labels = new HashSet<>();

    protected Project(){}

    public Project(String uemail, String pname, String pdescription) {
        this.uemail = uemail;
        this.pname = pname;
        this.pdescription = pdescription;
    }

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
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
}
