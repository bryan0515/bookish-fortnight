package crowdfunding.service;

import crowdfunding.entity.Pledge;
import crowdfunding.repository.PledgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by han on 5/9/17.
 */
@Service
public class PledgeService {

    @Autowired
    private PledgeRepository pledgeRepository;

    public void addPledge(Pledge pledge) {
        pledgeRepository.save(pledge);
    }
}
