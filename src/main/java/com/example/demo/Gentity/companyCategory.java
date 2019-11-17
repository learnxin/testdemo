package com.example.demo.Gentity;

import java.util.Date;

public class companyCategory {
    private Long id;

    private String companyCode;

    private String accreditType;

    private String venCode;

    private String categoryCode;

    private Date accreditStart;

    private Date accreditEnd;

    private String reviewStatus;

    private String status;

    private String createId;

    private Date createTime;

    private String updateId;

    private Date updateTime;

    private Byte deleteYn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public String getAccreditType() {
        return accreditType;
    }

    public void setAccreditType(String accreditType) {
        this.accreditType = accreditType == null ? null : accreditType.trim();
    }

    public String getVenCode() {
        return venCode;
    }

    public void setVenCode(String venCode) {
        this.venCode = venCode == null ? null : venCode.trim();
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode == null ? null : categoryCode.trim();
    }

    public Date getAccreditStart() {
        return accreditStart;
    }

    public void setAccreditStart(Date accreditStart) {
        this.accreditStart = accreditStart;
    }

    public Date getAccreditEnd() {
        return accreditEnd;
    }

    public void setAccreditEnd(Date accreditEnd) {
        this.accreditEnd = accreditEnd;
    }

    public String getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(String reviewStatus) {
        this.reviewStatus = reviewStatus == null ? null : reviewStatus.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId == null ? null : updateId.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getDeleteYn() {
        return deleteYn;
    }

    public void setDeleteYn(Byte deleteYn) {
        this.deleteYn = deleteYn;
    }
}