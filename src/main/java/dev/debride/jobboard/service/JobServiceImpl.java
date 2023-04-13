package dev.debride.jobboard.service;

import dev.debride.jobboard.models.Job;
import dev.debride.jobboard.repos.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class JobServiceImpl implements JobService{

    @Autowired
    JobRepo jobRepo;

    @Override
    public Job post(Job job) {
        //TODO: Job validation
        return jobRepo.save(job);
    }

    @Override
    public List<Job> getJobsByExp(Integer years) {
        return jobRepo.findByYears(years);
    }
}
