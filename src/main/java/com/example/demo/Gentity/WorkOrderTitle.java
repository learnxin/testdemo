package com.example.demo.Gentity;

import java.util.Date;

public class WorkOrderTitle {
    private Long id;

    private String workOrderNo;

    private String stationName;

    private String stationNo;

    private String orderType;

    private String processor;

    private String processorPhone;

    private Integer processorId;

    private String submitter;

    private String submitPhone;

    private Integer submitId;

    private Date tourStartTime;

    private String tourRemark;

    private Date tourStopTime;

    private Date createTime;

    private Boolean status;

    private Byte totalNum;

    private Date updateTime;

    private Boolean deleted;

    private String stationUuid;

    private Integer approvalId;

    private String approvalName;

    private Date approvalTime;

    private String approvalPhone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWorkOrderNo() {
        return workOrderNo;
    }

    public void setWorkOrderNo(String workOrderNo) {
        this.workOrderNo = workOrderNo == null ? null : workOrderNo.trim();
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName == null ? null : stationName.trim();
    }

    public String getStationNo() {
        return stationNo;
    }

    public void setStationNo(String stationNo) {
        this.stationNo = stationNo == null ? null : stationNo.trim();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor == null ? null : processor.trim();
    }

    public String getProcessorPhone() {
        return processorPhone;
    }

    public void setProcessorPhone(String processorPhone) {
        this.processorPhone = processorPhone == null ? null : processorPhone.trim();
    }

    public Integer getProcessorId() {
        return processorId;
    }

    public void setProcessorId(Integer processorId) {
        this.processorId = processorId;
    }

    public String getSubmitter() {
        return submitter;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter == null ? null : submitter.trim();
    }

    public String getSubmitPhone() {
        return submitPhone;
    }

    public void setSubmitPhone(String submitPhone) {
        this.submitPhone = submitPhone == null ? null : submitPhone.trim();
    }

    public Integer getSubmitId() {
        return submitId;
    }

    public void setSubmitId(Integer submitId) {
        this.submitId = submitId;
    }

    public Date getTourStartTime() {
        return tourStartTime;
    }

    public void setTourStartTime(Date tourStartTime) {
        this.tourStartTime = tourStartTime;
    }

    public String getTourRemark() {
        return tourRemark;
    }

    public void setTourRemark(String tourRemark) {
        this.tourRemark = tourRemark == null ? null : tourRemark.trim();
    }

    public Date getTourStopTime() {
        return tourStopTime;
    }

    public void setTourStopTime(Date tourStopTime) {
        this.tourStopTime = tourStopTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Byte getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Byte totalNum) {
        this.totalNum = totalNum;
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

    public String getStationUuid() {
        return stationUuid;
    }

    public void setStationUuid(String stationUuid) {
        this.stationUuid = stationUuid == null ? null : stationUuid.trim();
    }

    public Integer getApprovalId() {
        return approvalId;
    }

    public void setApprovalId(Integer approvalId) {
        this.approvalId = approvalId;
    }

    public String getApprovalName() {
        return approvalName;
    }

    public void setApprovalName(String approvalName) {
        this.approvalName = approvalName == null ? null : approvalName.trim();
    }

    public Date getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(Date approvalTime) {
        this.approvalTime = approvalTime;
    }

    public String getApprovalPhone() {
        return approvalPhone;
    }

    public void setApprovalPhone(String approvalPhone) {
        this.approvalPhone = approvalPhone == null ? null : approvalPhone.trim();
    }
}