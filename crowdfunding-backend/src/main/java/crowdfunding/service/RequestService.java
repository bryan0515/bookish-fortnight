package crowdfunding.service;

import crowdfunding.entity.Request;
import crowdfunding.entity.RequestId;
import crowdfunding.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by bryancheng on 2017/5/10.
 */
@Service
public class RequestService {
    @Autowired
    private RequestRepository requestRepository;

    public RequestId requestProject(Request request) {
        requestRepository.save(request);
        return request.getRequestId();
    }
}
