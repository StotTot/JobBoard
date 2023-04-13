package dev.debride.jobboard.models;

import jakarta.persistence.*;

@Entity
@Table(name = "\"jobs\"")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private Integer jobId;
    @Column(name = "company")
    private String company;
    @Column(name = "title")
    private String title;
    @Column(name = "role")
    private String role;
    @Column(name = "details")
    private String details;

    @Column(name = "years")
    private Integer years;
    @Column(name = "minimum")
    private Double minimum;
    @Column(name = "maximum")
    private Double maximum;
    @Column(name = "posted_date")
    private Long postedDate;
    @Column(name = "url")
    private String url;

    public Job(Integer job_id, String company, String title, String role, String details, Integer years, Double minimum, Double maximum, Long postedDate, String url) {
        this.jobId = job_id;
        this.company = company;
        this.title = title;
        this.role = role;
        this.details = details;
        this.years = years;
        this.minimum = minimum;
        this.maximum = maximum;
        this.postedDate = postedDate;
        this.url = url;
    }

    public Job() {
    }

    @Override
    public String toString() {
        return "Job{" +
                "job_id=" + jobId +
                ", company='" + company + '\'' +
                ", title='" + title + '\'' +
                ", role='" + role + '\'' +
                ", details='" + details + '\'' +
                ", years=" + years +
                ", minimum=" + minimum +
                ", maximum=" + maximum +
                ", postedDate=" + postedDate +
                ", url='" + url + '\'' +
                '}';
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }

    public Double getMinimum() {
        return minimum;
    }

    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }

    public Double getMaximum() {
        return maximum;
    }

    public void setMaximum(Double maximum) {
        this.maximum = maximum;
    }

    public Long getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(Long postedDate) {
        this.postedDate = postedDate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
