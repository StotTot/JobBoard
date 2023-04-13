package dev.debride.jobboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"dev.debride.jobboard"})
@EnableJpaRepositories(basePackages = {"dev.debride.jobboard.repos"})
@EntityScan(basePackages = {"dev.debride.jobboard.models"})
@SpringBootApplication
public class JobBoardApplication {
    public static void main(String[] args) {
        SpringApplication.run(JobBoardApplication.class, args);
    }
}