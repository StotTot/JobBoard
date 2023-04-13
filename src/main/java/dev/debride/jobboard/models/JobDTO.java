package dev.debride.jobboard.models;

public class JobDTO {

    private Integer jobId;

    private String company;

    private String title;

    private String role;

    private String details;

    private Integer years;

    private Double minimum;

    private Double maximum;

    private Long postedDate;

    private String url;

    public JobDTO(Job job) {
        this.jobId = job.getJobId();
        this.company = job.getCompany();
        this.title = job.getTitle();
        this.role = job.getRole();
        this.details = job.getDetails();
        this.years = job.getYears();
        this.minimum = job.getMinimum();
        this.maximum = job.getMaximum();
        this.postedDate = job.getPostedDate();
        this.url = job.getUrl();
    }

    public JobDTO() {
    }

    @Override
    public String toString() {
        return "JobDTO{" +
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
