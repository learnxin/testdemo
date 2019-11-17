package com.example.demo.TestTreeSet;

import lombok.Data;

/**
 * @Author: wangran
 * @Description: 组织树vo
 * @Date: 2019/6/10 17:54
 */
@Data
public class OrgTreeVo {
    private String lvOneOuCode;
    private String lvOneOuName;
    private String lvTwoOuCode;
    private String lvTwoOuName;
    private String lvThrOuCode;
    private String lvThrOuName;
    private String lvFourOuCode;
    private String lvFourOuName;

    public OrgTreeVo(String lvOneOuCode, String lvOneOuName, String lvTwoOuCode, String lvTwoOuName, String lvThrOuCode, String lvThrOuName, String lvFourOuCode, String lvFourOuName) {
        this.lvOneOuCode = lvOneOuCode;
        this.lvOneOuName = lvOneOuName;
        this.lvTwoOuCode = lvTwoOuCode;
        this.lvTwoOuName = lvTwoOuName;
        this.lvThrOuCode = lvThrOuCode;
        this.lvThrOuName = lvThrOuName;
        this.lvFourOuCode = lvFourOuCode;
        this.lvFourOuName = lvFourOuName;
    }
}
