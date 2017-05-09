package crowdfunding.entity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.persistence.*;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Date;

/**
 * Created by bryancheng on 2017/5/5.
 */

//class RequestIdConverter implements Converter<String, RequestId> {
//
//    "RequestId{project=1, sttime=2017-04-16 12:00:00.0}"
//
//    RequestId convert(String id) throws JSONException {
//        JSONObject jsonId = new JSONObject(id);
//        return new RequestId(jsonId.getString("project"), new Date(jsonId.getLong("sttime")));
//    }
//}

@Embeddable
public class RequestId implements Serializable {
//    default serial version id, required for serializable classes.
    private static final long serialVersionUID = 1L;

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

//    @Override
//    public String toString() {
//        String timeUrl = "";
//        try {
//            timeUrl = URLEncoder.encode(sttime.toString(), "UTF-8");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//
//        String url = "";
//        try {
//            url = URLEncoder.encode("/search/findRequestByRequestIdProjectAndRequestIdSttime?pid="+project.getPid()+"&sttime="+sttime, "UTF-8");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//
//        return "/search/findRequestByRequestIdProjectPidAndRequestIdSttime?pid="+project.getPid()+"&sttime="+timeUrl;
////        return url;
//    }

    @Override
    public String toString() {
        return "/RequestId{" +
                "project=" + project.getPid() +
                ", sttime=" + sttime.toString() +
                '}';
    }
}
