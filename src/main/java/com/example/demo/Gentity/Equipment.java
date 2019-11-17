package com.example.demo.Gentity;

import java.util.Date;

public class Equipment {
    private String uuid;

    private String vendorUuid;

    private String equipmentNo;

    private String equipmentName;

    private Double ratedCapacity;

    private Double power;

    private Double frequency;

    private String ratedVolt;

    private Double minOutVolt;

    private Double maxOutVolt;

    private Double maxOutCurrent;

    private Double minOutCurrent;

    private Integer status;

    private String isFlag;

    private String creatorUuid;

    private Date createdAt;

    private String updaterUuid;

    private Date updatedAt;

    private String assetSmallType;

    private String assetType;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getVendorUuid() {
        return vendorUuid;
    }

    public void setVendorUuid(String vendorUuid) {
        this.vendorUuid = vendorUuid == null ? null : vendorUuid.trim();
    }

    public String getEquipmentNo() {
        return equipmentNo;
    }

    public void setEquipmentNo(String equipmentNo) {
        this.equipmentNo = equipmentNo == null ? null : equipmentNo.trim();
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName == null ? null : equipmentName.trim();
    }

    public Double getRatedCapacity() {
        return ratedCapacity;
    }

    public void setRatedCapacity(Double ratedCapacity) {
        this.ratedCapacity = ratedCapacity;
    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    public Double getFrequency() {
        return frequency;
    }

    public void setFrequency(Double frequency) {
        this.frequency = frequency;
    }

    public String getRatedVolt() {
        return ratedVolt;
    }

    public void setRatedVolt(String ratedVolt) {
        this.ratedVolt = ratedVolt == null ? null : ratedVolt.trim();
    }

    public Double getMinOutVolt() {
        return minOutVolt;
    }

    public void setMinOutVolt(Double minOutVolt) {
        this.minOutVolt = minOutVolt;
    }

    public Double getMaxOutVolt() {
        return maxOutVolt;
    }

    public void setMaxOutVolt(Double maxOutVolt) {
        this.maxOutVolt = maxOutVolt;
    }

    public Double getMaxOutCurrent() {
        return maxOutCurrent;
    }

    public void setMaxOutCurrent(Double maxOutCurrent) {
        this.maxOutCurrent = maxOutCurrent;
    }

    public Double getMinOutCurrent() {
        return minOutCurrent;
    }

    public void setMinOutCurrent(Double minOutCurrent) {
        this.minOutCurrent = minOutCurrent;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getIsFlag() {
        return isFlag;
    }

    public void setIsFlag(String isFlag) {
        this.isFlag = isFlag == null ? null : isFlag.trim();
    }

    public String getCreatorUuid() {
        return creatorUuid;
    }

    public void setCreatorUuid(String creatorUuid) {
        this.creatorUuid = creatorUuid == null ? null : creatorUuid.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdaterUuid() {
        return updaterUuid;
    }

    public void setUpdaterUuid(String updaterUuid) {
        this.updaterUuid = updaterUuid == null ? null : updaterUuid.trim();
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getAssetSmallType() {
        return assetSmallType;
    }

    public void setAssetSmallType(String assetSmallType) {
        this.assetSmallType = assetSmallType == null ? null : assetSmallType.trim();
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType == null ? null : assetType.trim();
    }
}