package com.example.demo.test1.response;

/**
 * @Author: wangran
 * @Description:
 * @Date: 2021/8/6 下午5:05
 */
@lombok.Data
public class ResponseBody {

    public String code;
    public String message;
    public String success;
    public Data data;

}
