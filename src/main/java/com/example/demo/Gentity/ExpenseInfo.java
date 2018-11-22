package com.example.demo.Gentity;

import java.math.BigDecimal;
import java.util.Date;

public class ExpenseInfo {
    private Integer id;

    private String project;

    private String executive;

    private String accountname;

    private String depositbank;

    private String bankid;

    private String cardid;

    private String contacts;

    private String phonenumber;

    private String mailid;

    private String facsimile;

    private String address;

    private String postcode;

    private String area;

    private Date applytime;

    private String currency;

    private BigDecimal paid;

    private String payreason;

    private String remark;

    private String goodsname;

    private BigDecimal equivalent;

    private String unit;

    private Integer quantity;

    private String purpose;

    private String remarkg;

    private String projectid;

    private String exeuuid;

    private String type;

    private String operator;

    private Date expendtime;

    private Integer paytype;

    private Integer haveinvoice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project == null ? null : project.trim();
    }

    public String getExecutive() {
        return executive;
    }

    public void setExecutive(String executive) {
        this.executive = executive == null ? null : executive.trim();
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname == null ? null : accountname.trim();
    }

    public String getDepositbank() {
        return depositbank;
    }

    public void setDepositbank(String depositbank) {
        this.depositbank = depositbank == null ? null : depositbank.trim();
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid == null ? null : bankid.trim();
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid == null ? null : cardid.trim();
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public String getMailid() {
        return mailid;
    }

    public void setMailid(String mailid) {
        this.mailid = mailid == null ? null : mailid.trim();
    }

    public String getFacsimile() {
        return facsimile;
    }

    public void setFacsimile(String facsimile) {
        this.facsimile = facsimile == null ? null : facsimile.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public Date getApplytime() {
        return applytime;
    }

    public void setApplytime(Date applytime) {
        this.applytime = applytime;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public BigDecimal getPaid() {
        return paid;
    }

    public void setPaid(BigDecimal paid) {
        this.paid = paid;
    }

    public String getPayreason() {
        return payreason;
    }

    public void setPayreason(String payreason) {
        this.payreason = payreason == null ? null : payreason.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public BigDecimal getEquivalent() {
        return equivalent;
    }

    public void setEquivalent(BigDecimal equivalent) {
        this.equivalent = equivalent;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose == null ? null : purpose.trim();
    }

    public String getRemarkg() {
        return remarkg;
    }

    public void setRemarkg(String remarkg) {
        this.remarkg = remarkg == null ? null : remarkg.trim();
    }

    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid == null ? null : projectid.trim();
    }

    public String getExeuuid() {
        return exeuuid;
    }

    public void setExeuuid(String exeuuid) {
        this.exeuuid = exeuuid == null ? null : exeuuid.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getExpendtime() {
        return expendtime;
    }

    public void setExpendtime(Date expendtime) {
        this.expendtime = expendtime;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public Integer getHaveinvoice() {
        return haveinvoice;
    }

    public void setHaveinvoice(Integer haveinvoice) {
        this.haveinvoice = haveinvoice;
    }
}