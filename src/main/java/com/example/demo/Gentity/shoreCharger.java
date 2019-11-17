package com.example.demo.Gentity;

import java.util.Date;

public class shoreCharger {
    private String uuid;

    private String spaceUuid;

    private String stakeuuid;

    private String stationuuid;

    private String parkingAreaUuid;

    private String chargerNo;

    private String stakeNo;

    private String assetNo;

    private String ct;

    private String pt;

    private String rate;

    private Double ratedCapacity;

    private String type;

    private Integer status;

    private String isFlag;

    private String creatorUuid;

    private Date createdAt;

    private String updaterUuid;

    private Date updatedAt;

    private String name;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getSpaceUuid() {
        return spaceUuid;
    }

    public void setSpaceUuid(String spaceUuid) {
        this.spaceUuid = spaceUuid == null ? null : spaceUuid.trim();
    }

    public String getStakeuuid() {
        return stakeuuid;
    }

    public void setStakeuuid(String stakeuuid) {
        this.stakeuuid = stakeuuid == null ? null : stakeuuid.trim();
    }

    public String getStationuuid() {
        return stationuuid;
    }

    public void setStationuuid(String stationuuid) {
        this.stationuuid = stationuuid == null ? null : stationuuid.trim();
    }

    public String getParkingAreaUuid() {
        return parkingAreaUuid;
    }

    public void setParkingAreaUuid(String parkingAreaUuid) {
        this.parkingAreaUuid = parkingAreaUuid == null ? null : parkingAreaUuid.trim();
    }

    public String getChargerNo() {
        return chargerNo;
    }

    public void setChargerNo(String chargerNo) {
        this.chargerNo = chargerNo == null ? null : chargerNo.trim();
    }

    public String getStakeNo() {
        return stakeNo;
    }

    public void setStakeNo(String stakeNo) {
        this.stakeNo = stakeNo == null ? null : stakeNo.trim();
    }

    public String getAssetNo() {
        return assetNo;
    }

    public void setAssetNo(String assetNo) {
        this.assetNo = assetNo == null ? null : assetNo.trim();
    }

    public String getCt() {
        return ct;
    }

    public void setCt(String ct) {
        this.ct = ct == null ? null : ct.trim();
    }

    public String getPt() {
        return pt;
    }

    public void setPt(String pt) {
        this.pt = pt == null ? null : pt.trim();
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate == null ? null : rate.trim();
    }

    public Double getRatedCapacity() {
        return ratedCapacity;
    }

    public void setRatedCapacity(Double ratedCapacity) {
        this.ratedCapacity = ratedCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}