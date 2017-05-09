package crowdfunding.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by han on 5/8/17.
 */
@Entity
public class Comment implements Serializable{
    @Id
    @ManyToOne
    @JoinColumn(name = "uemail")
    private Customer customerComment;

    @Id
    @ManyToOne
    @JoinColumn(name = "pid")
    private Project projectComment;

    @Id
    @Temporal(TemporalType.TIMESTAMP)
    private Date commenttime;
    private String comment;

    protected Comment() {};

    public Comment(Customer customerComment, Project projectComment, Date commenttime, String comment) {
        this.customerComment = customerComment;
        this.projectComment = projectComment;
        this.commenttime = commenttime;
        this.comment = comment;
    }

    public Customer getCustomerComment() {
        return customerComment;
    }

    public void setCustomerComment(Customer customerComment) {
        this.customerComment = customerComment;
    }

    public Project getProjectComment() {
        return projectComment;
    }

    public void setProjectComment(Project projectComment) {
        this.projectComment = projectComment;
    }

    public Date getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(Date commenttime) {
        this.commenttime = commenttime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Comment comment1 = (Comment) o;
//
//        if (customerComment != null ? !customerComment.equals(comment1.customerComment) : comment1.customerComment != null)
//            return false;
//        if (projectComment != null ? !projectComment.equals(comment1.projectComment) : comment1.projectComment != null)
//            return false;
//        if (commenttime != null ? !commenttime.equals(comment1.commenttime) : comment1.commenttime != null)
//            return false;
//        return comment != null ? comment.equals(comment1.comment) : comment1.comment == null;
//
//    }
//
//    @Override
//    public int hashCode() {
//        int result = customerComment != null ? customerComment.hashCode() : 0;
//        result = 31 * result + (projectComment != null ? projectComment.hashCode() : 0);
//        result = 31 * result + (commenttime != null ? commenttime.hashCode() : 0);
//        result = 31 * result + (comment != null ? comment.hashCode() : 0);
//        return result;
//    }
}
