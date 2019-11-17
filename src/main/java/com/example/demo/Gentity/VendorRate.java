package com.example.demo.Gentity;

import java.math.BigDecimal;
import java.util.Date;

public class VendorRate {
    private Long id;

    private Long venCode;

    private String accreditId;
    //合作模式
    private String mode;

    private String busCode;

    private String categoryCode;

    private String brandCode;

    private BigDecimal rateData;

    private String status;

    private String reviewStatus;

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

    public Long getVenCode() {
        return venCode;
    }

    public void setVenCode(Long venCode) {
        this.venCode = venCode;
    }

    public String getAccreditId() {
        return accreditId;
    }

    public void setAccreditId(String accreditId) {
        this.accreditId = accreditId == null ? null : accreditId.trim();
    }




    public String getBusCode() {
        return busCode;
    }

    public void setBusCode(String busCode) {
        this.busCode = busCode == null ? null : busCode.trim();
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode == null ? null : categoryCode.trim();
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode == null ? null : brandCode.trim();
    }

    public BigDecimal getRateData() {
        return rateData;
    }

    public void setRateData(BigDecimal rateData) {
        this.rateData = rateData;
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