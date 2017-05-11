package crowdfunding.service;

import crowdfunding.entity.Allcombined;
import crowdfunding.entity.Logdetail;
import crowdfunding.repository.AllcombinedRepository;
import crowdfunding.repository.LogdetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by han on 5/11/17.
 */
@Service
public class LogdetailService {
    @Autowired
    LogdetailRepository logdetailRepository;

    public void addLogdetail(Logdetail logdetail) {
        logdetailRepository.save(logdetail);
    }

}
