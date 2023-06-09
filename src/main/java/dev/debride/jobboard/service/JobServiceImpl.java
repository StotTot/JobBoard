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
        if (job != null)
            return jobRepo.save(job);
        else
            return null;
    }

    @Override
    public List<Job> getJobsByExp(Integer years) {
        return jobRepo.findByYears(years);
    }

    @Override
    public List<Job> getJobsByLocation(String location) {
        return jobRepo.findByLocation(location);
    }
}
