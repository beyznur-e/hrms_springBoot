package api.controllers;

import business.abstracts.JobService;
import business.concretes.JobManager;
import entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/titles")
public class JobController {
    private JobService jobService;

    @Autowired
    public JobController(JobService jobService){
        this.jobService = jobService;
    }

    @GetMapping("/getall")
    public List<Job> getAll(){
        return this.jobService.getAll();
    }
}
