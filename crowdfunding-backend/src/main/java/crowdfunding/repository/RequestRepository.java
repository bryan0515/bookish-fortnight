package crowdfunding.repository;

import crowdfunding.entity.Request;
import crowdfunding.entity.RequestId;
import crowdfunding.entity.RequestStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by bryancheng on 2017/5/5.
 */
public interface RequestRepository extends JpaRepository<Request, RequestId> {
    List<Request> findRequestsByStatus(final RequestStatus status);
}
