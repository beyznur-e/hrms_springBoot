package business.concretes;

import business.abstracts.JobService;
import dataAccess.JobDao;
import entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobManager implements JobService {
    private JobDao jobDao;

    @Autowired
    public JobManager(JobDao jobDao){
        this.jobDao = jobDao;
    }

    @Override
    public List<Job> getAll() {
        return jobDao.findAll();
    }
}
