package com.example.demo.Gentity;

import java.util.Date;

public class WorkOrderDetails {
    private Long id;

    private String stakeName;

    private String stakeNo;

    private String stakeUuid;

    private String faultType;

    private String remark;

    private String fixRemark;

    private Boolean fixStatus;

    private Date createTime;

    private Date updateTime;

    private Boolean deleted;

    private Long titleId;

    private String filesPres;

    private String filesPosts;

    private Integer stakeStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStakeName() {
        return stakeName;
    }

    public void setStakeName(String stakeName) {
        this.stakeName = stakeName == null ? null : stakeName.trim();
    }

    public String getStakeNo() {
        return stakeNo;
    }

    public void setStakeNo(String stakeNo) {
        this.stakeNo = stakeNo == null ? null : stakeNo.trim();
    }

    public String getStakeUuid() {
        return stakeUuid;
    }

    public void setStakeUuid(String stakeUuid) {
        this.stakeUuid = stakeUuid == null ? null : stakeUuid.trim();
    }

    public String getFaultType() {
        return faultType;
    }

    public void setFaultType(String faultType) {
        this.faultType = faultType == null ? null : faultType.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getFixRemark() {
        return fixRemark;
    }

    public void setFixRemark(String fixRemark) {
        this.fixRemark = fixRemark == null ? null : fixRemark.trim();
    }

    public Boolean getFixStatus() {
        return fixStatus;
    }

    public void setFixStatus(Boolean fixStatus) {
        this.fixStatus = fixStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Long getTitleId() {
        return titleId;
    }

    public void setTitleId(Long titleId) {
        this.titleId = titleId;
    }

    public String getFilesPres() {
        return filesPres;
    }

    public void setFilesPres(String filesPres) {
        this.filesPres = filesPres == null ? null : filesPres.trim();
    }

    public String getFilesPosts() {
        return filesPosts;
    }

    public void setFilesPosts(String filesPosts) {
        this.filesPosts = filesPosts == null ? null : filesPosts.trim();
    }

    public Integer getStakeStatus() {
        return stakeStatus;
    }

    public void setStakeStatus(Integer stakeStatus) {
        this.stakeStatus = stakeStatus;
    }
}