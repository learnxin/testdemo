package com.example.demo.test1.request;

import lombok.Data;

/**
 * @Author: wangran
 * @Description:
 * @Date: 2021/8/6 下午5:01
 */
@Data
public class CheckObject {
    public FlightInfo flightInfo;
    public PassageInfo passageInfo;
    public RuleInfo ruleInfo;
}
