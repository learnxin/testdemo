package com.example.demo.Gentity;

import java.util.Date;

public class PresentRelevance {
    private Long id;

    private String projectName;

    private String projectid;

    private Date presentTime;

    private String presentUsername;

    private String presentUserid;

    private String remark;

    private Date creattime;

    private Date updatetime;

    private Boolean deleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid == null ? null : projectid.trim();
    }

    public Date getPresentTime() {
        return presentTime;
    }

    public void setPresentTime(Date presentTime) {
        this.presentTime = presentTime;
    }

    public String getPresentUsername() {
        return presentUsername;
    }

    public void setPresentUsername(String presentUsername) {
        this.presentUsername = presentUsername == null ? null : presentUsername.trim();
    }

    public String getPresentUserid() {
        return presentUserid;
    }

    public void setPresentUserid(String presentUserid) {
        this.presentUserid = presentUserid == null ? null : presentUserid.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}