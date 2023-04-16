package dev.debride.jobboard.service;

import dev.debride.jobboard.models.Job;

import java.util.List;

public interface JobService {
    public Job post(Job job);
    public List<Job> getJobsByExp(Integer years);
    public List<Job> getJobsByLocation(String location);
}
