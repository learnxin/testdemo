package com.example.demo.Gentity;

import java.util.Date;

public class joinVendorItem {
    private Long id;

    private Long joinCode;

    private Long categoryCode;

    private String purchaseId;

    private String name;

    private String brand;

    private Long price;

    private Long salesPrice;

    private String tmHref;

    private String tbHref;

    private String jdHref;

    private String otherHref;

    private String level;

    private String remark;

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

    public Long getJoinCode() {
        return joinCode;
    }

    public void setJoinCode(Long joinCode) {
        this.joinCode = joinCode;
    }

    public Long getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(Long categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId == null ? null : purchaseId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Long salesPrice) {
        this.salesPrice = salesPrice;
    }

    public String getTmHref() {
        return tmHref;
    }

    public void setTmHref(String tmHref) {
        this.tmHref = tmHref == null ? null : tmHref.trim();
    }

    public String getTbHref() {
        return tbHref;
    }

    public void setTbHref(String tbHref) {
        this.tbHref = tbHref == null ? null : tbHref.trim();
    }

    public String getJdHref() {
        return jdHref;
    }

    public void setJdHref(String jdHref) {
        this.jdHref = jdHref == null ? null : jdHref.trim();
    }

    public String getOtherHref() {
        return otherHref;
    }

    public void setOtherHref(String otherHref) {
        this.otherHref = otherHref == null ? null : otherHref.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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