package crowdfunding.entity;

import javax.persistence.*;

/**
 * Created by han on 5/5/17.
 */
@Entity
public class Follows {

    @EmbeddedId
    private FollowId followId;

    protected Follows() {}

    public Follows(FollowId followId) {
        this.followId = followId;
    }

    public Customer getFollowId() {
        return followId.getCustomer();
    }

    public void setFollowId(FollowId followId) {
        this.followId = followId;
    }
}
