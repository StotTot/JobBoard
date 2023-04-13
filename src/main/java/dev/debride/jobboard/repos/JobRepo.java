package dev.debride.jobboard.repos;

import dev.debride.jobboard.models.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Repository
public interface JobRepo extends CrudRepository<Job, Integer> {

        List<Job> findByYears(Integer years);
}
