package task.Entity;

public class StudentUser {
    private Integer id;
    private Integer status;
    private Integer working;
    private String name;
    private String message;
    private Long updateat;
    private Long creatat;
    private String updateby;
    private String creatby;
    private Integer jobid;
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    private String picture;

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getWorking() {
        return working;
    }

    public void setWorking(Integer working) {
        this.working = working;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getUpdateat() {
        return updateat;
    }

    public void setUpdateat(Long updateat) {
        this.updateat = updateat;
    }

    public Long getCreatat() {
        return creatat;
    }

    public void setCreatat(Long creatat) {
        this.creatat = creatat;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby;
    }

    public String getCreatby() {
        return creatby;
    }

    public void setCreatby(String creatby) {
        this.creatby = creatby;
    }

    @Override
    public String toString() {
        return "StudentUser{" +
                "id=" + id +
                ", status=" + status +
                ", working=" + working +
                ", name='" + name + '\'' +
                ", message='" + message + '\'' +
                ", updateat=" + updateat +
                ", creatat=" + creatat +
                ", updateby='" + updateby + '\'' +
                ", creatby='" + creatby + '\'' +
                ", jobid=" + jobid +
                ", job='" + job + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }
}
