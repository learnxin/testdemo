package com.example.demo.Gentity;

import java.util.Date;

public class companyBrand {
    private Long id;

    private Long companyCode;

    private String accreditType;

    private Long venCode;

    private Long brandCode;

    private Date accreditStart;

    private Date accreditEnd;

    private Byte longTimeYn;

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

    public Long getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(Long companyCode) {
        this.companyCode = companyCode;
    }

    public String getAccreditType() {
        return accreditType;
    }

    public void setAccreditType(String accreditType) {
        this.accreditType = accreditType == null ? null : accreditType.trim();
    }

    public Long getVenCode() {
        return venCode;
    }

    public void setVenCode(Long venCode) {
        this.venCode = venCode;
    }

    public Long getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(Long brandCode) {
        this.brandCode = brandCode;
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

    public Byte getLongTimeYn() {
        return longTimeYn;
    }

    public void setLongTimeYn(Byte longTimeYn) {
        this.longTimeYn = longTimeYn;
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