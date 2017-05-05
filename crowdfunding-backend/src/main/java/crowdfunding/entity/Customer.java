package crowdfunding.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by bryancheng on 2017/5/3.
 */
@Entity
public class Customer {

    @Id
    private String uemail;
    private String cname;
    private String password;
    private String address;

    protected Customer() {}

    public Customer(String uemail, String cname, String password, String address) {
        this.uemail = uemail;
        this.cname = cname;
        this.password = password;
        this.address = address;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
