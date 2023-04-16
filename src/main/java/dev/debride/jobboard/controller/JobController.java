package dev.debride.jobboard.controller;

import dev.debride.jobboard.models.Job;
import dev.debride.jobboard.models.JobDTO;
import dev.debride.jobboard.repos.JobRepo;
import dev.debride.jobboard.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Component
@RestController
@CrossOrigin
public class JobController {

    @Autowired
    JobRepo jobRepo;

    @Autowired
    JobService jobService;

    @PostMapping("/add")
    public ResponseEntity<JobDTO> addJob(@RequestBody(required = true) Job job) {
        return ResponseEntity.status(201).body(new JobDTO(jobService.post(job)));
    }

    @GetMapping("/jobs")
    public ResponseEntity<List<JobDTO>> getJobs(){
        List<JobDTO> jobList = new ArrayList<>();
        List<Job> jobs = new ArrayList<>();
        jobRepo.findAll().forEach(jobs :: add);
        for (Job j : jobs)
            jobList.add(new JobDTO(j));

        return ResponseEntity.status(200).body(jobList);
    }

    @GetMapping("/jobs/exp/{years}")
    public ResponseEntity<List<JobDTO>> getJobsByExp(@PathVariable int years) {
        List<JobDTO> jobList = new ArrayList<>();
        List<Job> jobs = new ArrayList<>(jobRepo.findByYears(years));
        for (Job j : jobs)
            jobList.add(new JobDTO(j));
        return ResponseEntity.status(200).body(jobList);
    }

    @GetMapping("/jobs/location/{location}")
    public ResponseEntity<List<JobDTO>> getJobsByLocation(@PathVariable String location) {
        List<JobDTO> jobList = new ArrayList<>();
        List<Job> jobs = new ArrayList<>(jobRepo.findByLocation(location));
        for (Job j : jobs)
            jobList.add(new JobDTO(j));
        return ResponseEntity.status(200).body(jobList);
    }

}
