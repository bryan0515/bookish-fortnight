package crowdfunding.service;

import crowdfunding.entity.Project;
import crowdfunding.entity.Request;
import crowdfunding.repository.ProjectRepository;
import crowdfunding.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by bryancheng on 2017/5/10.
 */
@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private RequestRepository requestRepository;

    public Long createProject(Project project) {
        projectRepository.save(project);
        return project.getPid();
    }

    public void createRequest(Request request) {
        requestRepository.save(request);
    }
}
