package task.Entity;

public class JobsUser {
    private Integer id;
    private String name;
    private String message;
    private Long updateat;
    private Long creatat;
    private String updateby;
    private String creatby;
    private Integer worktotle;
    private Integer studytotle;
    private String sill;
    private String complexity;
    private String cycle;
    private String payone;
    private String paytwo;

    public String getPayone() {
        return payone;
    }

    public void setPayone(String payone) {
        this.payone = payone;
    }

    public String getPaytwo() {
        return paytwo;
    }

    public void setPaytwo(String paytwo) {
        this.paytwo = paytwo;
    }

    public String getPaythree() {
        return paythree;
    }

    public void setPaythree(String paythree) {
        this.paythree = paythree;
    }

    private String paythree;

    public Integer getWorktotle() { return worktotle; }

    public void setWorktotle(Integer worktotle) {
        this.worktotle = worktotle;
    }

    public Integer getStudytotle() {
        return studytotle;
    }

    public void setStudytotle(Integer studytotle) {
        this.studytotle = studytotle;
    }


    public String getSill() {
        return sill;
    }

    public void setSill(String sill) {
        this.sill = sill;
    }

    public String getComplexity() {
        return complexity;
    }

    public void setComplexity(String complexity) {
        this.complexity = complexity;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public String getRareness() {
        return rareness;
    }

    public void setRareness(String rareness) {
        this.rareness = rareness;
    }

    private String rareness;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        return "JobsUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", message='" + message + '\'' +
                ", updateat=" + updateat +
                ", creatat=" + creatat +
                ", updateby='" + updateby + '\'' +
                ", creatby='" + creatby + '\'' +
                ", worktotle=" + worktotle +
                ", studytotle=" + studytotle +
                ", sill='" + sill + '\'' +
                ", complexity='" + complexity + '\'' +
                ", cycle='" + cycle + '\'' +
                ", payone='" + payone + '\'' +
                ", paytwo='" + paytwo + '\'' +
                ", paythree='" + paythree + '\'' +
                ", rareness='" + rareness + '\'' +
                '}';
    }
}
