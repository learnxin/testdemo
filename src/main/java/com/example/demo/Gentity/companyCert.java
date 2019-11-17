package com.example.demo.Gentity;

import java.util.Date;

class CompanyCert1 {
    private Long id;

    private String companyCode;

    private String venCode;

    private String certConfId;

    private String certType;

    private Long companyAccreditId;

    private String certNum;

    private Date accreditStart;

    private Date accreditEnd;

    private Byte longTimeYn;

    private String certInfo;

    private String reviewStatus;

    private String createId;

    private Date createTime;

    private String updateId;

    private Date updateTime;

    private Byte deleteYn;

    private String certArea;

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

    public String getVenCode() {
        return venCode;
    }

    public void setVenCode(String venCode) {
        this.venCode = venCode == null ? null : venCode.trim();
    }

    public String getCertConfId() {
        return certConfId;
    }

    public void setCertConfId(String certConfId) {
        this.certConfId = certConfId == null ? null : certConfId.trim();
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType == null ? null : certType.trim();
    }

    public Long getCompanyAccreditId() {
        return companyAccreditId;
    }

    public void setCompanyAccreditId(Long companyAccreditId) {
        this.companyAccreditId = companyAccreditId;
    }

    public String getCertNum() {
        return certNum;
    }

    public void setCertNum(String certNum) {
        this.certNum = certNum == null ? null : certNum.trim();
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

    public String getCertInfo() {
        return certInfo;
    }

    public void setCertInfo(String certInfo) {
        this.certInfo = certInfo == null ? null : certInfo.trim();
    }

    public String getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(String reviewStatus) {
        this.reviewStatus = reviewStatus == null ? null : reviewStatus.trim();
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

    public String getCertArea() {
        return certArea;
    }

    public void setCertArea(String certArea) {
        this.certArea = certArea == null ? null : certArea.trim();
    }
}