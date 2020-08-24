package com.example.demo.Gentity;

import java.math.BigDecimal;
import java.util.Date;

public class DonateInfo {
    private Integer id;

    private String donor;

    private String donorid;

    private String organization;

    private String organizationid;

    private String receiptno;

    private Date danatetime;

    private Integer donatetype;

    private String currency;

    private BigDecimal amount;

    private String goodstype;

    private String goodsname;

    private Integer quantity;

    private String goodsunit;

    private String sharescompany;

    private Integer shockquantity;

    private BigDecimal equivalent;

    private String donateprogram;

    private String programid;

    private String invoicegettype;

    private String expressnumber;

    private Date postdate;

    private String remark;

    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDonor() {
        return donor;
    }

    public void setDonor(String donor) {
        this.donor = donor == null ? null : donor.trim();
    }

    public String getDonorid() {
        return donorid;
    }

    public void setDonorid(String donorid) {
        this.donorid = donorid == null ? null : donorid.trim();
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    public String getOrganizationid() {
        return organizationid;
    }

    public void setOrganizationid(String organizationid) {
        this.organizationid = organizationid == null ? null : organizationid.trim();
    }

    public String getReceiptno() {
        return receiptno;
    }

    public void setReceiptno(String receiptno) {
        this.receiptno = receiptno == null ? null : receiptno.trim();
    }

    public Date getDanatetime() {
        return danatetime;
    }

    public void setDanatetime(Date danatetime) {
        this.danatetime = danatetime;
    }

    public Integer getDonatetype() {
        return donatetype;
    }

    public void setDonatetype(Integer donatetype) {
        this.donatetype = donatetype;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getGoodstype() {
        return goodstype;
    }

    public void setGoodstype(String goodstype) {
        this.goodstype = goodstype == null ? null : goodstype.trim();
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getGoodsunit() {
        return goodsunit;
    }

    public void setGoodsunit(String goodsunit) {
        this.goodsunit = goodsunit == null ? null : goodsunit.trim();
    }

    public String getSharescompany() {
        return sharescompany;
    }

    public void setSharescompany(String sharescompany) {
        this.sharescompany = sharescompany == null ? null : sharescompany.trim();
    }

    public Integer getShockquantity() {
        return shockquantity;
    }

    public void setShockquantity(Integer shockquantity) {
        this.shockquantity = shockquantity;
    }

    public BigDecimal getEquivalent() {
        return equivalent;
    }

    public void setEquivalent(BigDecimal equivalent) {
        this.equivalent = equivalent;
    }

    public String getDonateprogram() {
        return donateprogram;
    }

    public void setDonateprogram(String donateprogram) {
        this.donateprogram = donateprogram == null ? null : donateprogram.trim();
    }

    public String getProgramid() {
        return programid;
    }

    public void setProgramid(String programid) {
        this.programid = programid == null ? null : programid.trim();
    }

    public String getInvoicegettype() {
        return invoicegettype;
    }

    public void setInvoicegettype(String invoicegettype) {
        this.invoicegettype = invoicegettype == null ? null : invoicegettype.trim();
    }

    public String getExpressnumber() {
        return expressnumber;
    }

    public void setExpressnumber(String expressnumber) {
        this.expressnumber = expressnumber == null ? null : expressnumber.trim();
    }

    public Date getPostdate() {
        return postdate;
    }

    public void setPostdate(Date postdate) {
        this.postdate = postdate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}