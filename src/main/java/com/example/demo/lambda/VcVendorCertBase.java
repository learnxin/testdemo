//package com.example.demo.lambda;
//
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//import lombok.Data;
//import lombok.experimental.Accessors;
//
//import java.util.Date;
//
///**
// * @Author: wangran
// * @Description: 资质基类
// * @Date: 2019/7/24 17:27
// */
//@Data
//@Accessors(chain = true)
//@ApiModel("资质基类")
//public class VcVendorCertBase  {
//    @ApiModelProperty(value = "主键id")
//    private Long id;
//    @ApiModelProperty(value = "公司编号")
//    private Long companyId;
//    @ApiModelProperty(value = "供应商编号")
//    private Long venId;
//    @ApiModelProperty(value = "资质id")
//    private Long certId;
//
//    @ApiModelProperty(value = "资质文件名(从资质中心读取)")
//    private String certName;
//
//    @ApiModelProperty(value = "资质证件号")
//    private String certNum;
//    @ApiModelProperty(value = "资质生效期")
//    private Date accreditStart;
//    @ApiModelProperty(value = "资质失效期")
//    private Date accreditEnd;
//    @ApiModelProperty(value = "资质是否长期有效")
//    private Integer longTimeYn;
//    @ApiModelProperty(value = "资质说明")
//    private String certInfo;
//    @ApiModelProperty(value = "资质生效地区")
//    private String certArea;
//
//    @ApiModelProperty(value = "资质文件")
//    private String certFile;
//
//
//    @ApiModelProperty(value = "审核状态")
//    private String reviewStatus;
//
//    @ApiModelProperty(value = "状态")
//    private String status;
//
//}
