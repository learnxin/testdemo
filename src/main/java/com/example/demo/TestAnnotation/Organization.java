package com.example.demo.TestAnnotation;


import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * @author shadow-zl
 * @date 2019-04-28 11:36
 * @Description:
 */

@Data
@Accessors(chain = true)
@Component
public class Organization implements Serializable {


    private Integer id;
    private String token;
    private String ouCode;
    @NotBlank(message = "父级机构编码parentOuCode 不能为空")
    private String parentOuCode;
    private Integer ouLevel;
    @NotNull(message = "组织机构类型不能为空")
    private Integer ouType;
    private String ouLabel;
    @NotBlank(message = "机构名称ouName 不能为空")
    private String ouName;
    private String shortName;
    private String engName;
    private Integer ouProp;
    @NotBlank(message = "组织机构标准编号standardCode 不能为空")
    private String standardCode;
    private Integer state;
    private Integer regChannel;
    private Integer creatorId;
    private String creator;
    @testAnnotation("yyf")
    private Date createTime;
    private Integer modifierId;
    private String modifier;
    private Date modifyTime;
    private String rootOuCode;
    private Boolean deleted;
    private Integer merCategory;



    @Dict( srcField = "merCategory",dictType ="Nrad_Mer_category")
    private String merCategoryStr;

    @Dict( srcField = "ouProp",dictType ="Nrad_Company_Prop")
    private String ouPropStr;

    @Dict( srcField = "state",dictType ="Nrad_Org_State")
    private String stateStr;

    @Dict( srcField = "ouType",dictType ="Nrad_Org_Type")
    private String ouTypeStr;
}
