package com.example.demo.test1.request;

import lombok.Data;

/**
 * @Author: wangran
 * @Description:
 * @Date: 2021/8/6 下午4:55
 */
@Data
public class RequestBody {

    public String itemCode;
    public String itemName;
    public String skuCode;
    public String itemSalePrice;
    public String skuSalePrice;
    public CheckObject checkObject;

}

