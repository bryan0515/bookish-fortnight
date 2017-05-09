package crowdfunding.repository;

import crowdfunding.entity.Project;
import crowdfunding.entity.Request;
import crowdfunding.entity.RequestId;
import crowdfunding.entity.RequestStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Created by bryancheng on 2017/5/5.
 */
public interface RequestRepository extends JpaRepository<Request, RequestId> {
    List<Request> findAll();
    Collection<Request> findRequestByRequestIdProjectPidAndRequestIdSttime(
            final @Param("pid") long pid,
            final @Param("sttime") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.s") Date sttime);
    Collection<Request> findRequestsByStatus(final @Param("requestStatus") RequestStatus status);
//    Collection<Request> findRequestByRequestIdProject(final @Param(""))
}
