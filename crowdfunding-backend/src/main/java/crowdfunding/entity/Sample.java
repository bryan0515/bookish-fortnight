package crowdfunding.entity;

import javax.persistence.*;

/**
 * Created by bryancheng on 2017/5/4.
 */
@Entity
public class Sample {
    @Id
    @GeneratedValue
    private long sid;
//    private Project project;
    private String content;
    @Lob
    private String media;

    @ManyToOne
    @JoinColumn(name="pid")
    private Project project;

    protected Sample(){}

    public Sample(String content, String media, Project project) {
        this.content = content;
        this.media = media;
        this.project = project;
    }

    public long getSid() {
        return sid;
    }

    public void setSid(long sid) {
        this.sid = sid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
