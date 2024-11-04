package business.abstracts;

import entities.concretes.Job;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobService {
    List<Job> getAll();
}
