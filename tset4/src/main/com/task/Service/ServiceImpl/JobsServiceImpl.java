package task.Service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import task.Dao.JobsMapper;
import task.Entity.JobsUser;
import task.Service.JobsService;

import java.util.List;

@Service("JobsService")
public class JobsServiceImpl implements JobsService {
    @Autowired
    JobsMapper jobsMapper;
    @Override
    public List<JobsUser> getListJob(){
        return jobsMapper.getListJob();
    }

}