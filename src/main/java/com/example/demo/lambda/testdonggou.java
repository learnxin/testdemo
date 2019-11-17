package com.example.demo.lambda;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Author: wangran
 * @Description: ${description}
 * @Date: 2019/10/16 16:40
 */
@Slf4j
public class testdonggou {
    @Test
    public void testtrycatch(){
        for (int i = 0; i < 3; i++) {
            try {
                String testv="yyf";
                System.out.println(testv);

                return;
            } catch (Exception e) {
                log.error("调用资质通过回调接口失败",e);
            }
        }
        System.out.println("break");
    }
    @Test
    public void testNull2Json(){
        String  str= "{\"uuid\":null,\"extra\":null,\"page\":{\"extra\":null,\"pageNo\":1,\"pageSize\":20},\"id\":null,\"venName\":null,\"venType\":\"0,3\",\"companyId\":null,\"marketId\":\"1\",\"venMode\":null,\"linkCode\":null,\"ownId\":null,\"status\":\"0\",\"crossYn\":null,\"foreignYn\":null,\"enteredStartDate\":null,\"enteredEndDate\":null,\"banIds\":null,\"queryOption\":{\"uuid\":null,\"extra\":null,\"needBankInfo\":false,\"needVendorHeader\":false,\"needVendorMail\":false,\"needVendorManufacturer\":false,\"needOldPartner\":true,\"needCompany\":true,\"needMode\":false,\"write\":false,\"className\":\"cn.com.ocj.giant.center.vendor.api.dto.input.vendor.VcVendorRpcQueryOptionIn\"},\"write\":false,\"className\":\"cn.com.ocj.giant.center.vendor.api.dto.input.vendor.VcVendorListRpcQueryIn\"}";
        String remove = StringUtils.remove(str, "\\");
        System.out.println(remove);
        System.out.println(JSON.toJSONString(null));
    }



    /**
     * 组装数据
     * @param <T> 注入数据
     * @param <R> 注入数据比较key
     * @param <T1> 被注入数据
     * @param <R1> 被注入数据比较key
     */
    public static <T,R,T1,R1> void toPackData(List<T> list, Function<T,R> func,
                                             List<T1> list1, Function<T1,R1> func1,
                                             BiConsumer<T,T1> action){
        if(CollectionUtils.isEmpty(list)||
                CollectionUtils.isEmpty(list1)){
            return;
        }
        //先通过key 组装数据
        Map<R1,T1> dataMap=list1.stream().collect(
                Collectors.toMap(func1, (k)->k));
        list.forEach(row->{
            T1 t1=dataMap.get(func.apply(row));
            //不为空再塞值
            if(t1!=null){
                action.accept(row, t1);
            }
        });

    }


    /**
     * 组装数据
     * @param <T> 注入数据
     * @param <R> 注入数据比较key
     * @param <T1> 被注入数据
     * @param <R1> 被注入数据比较key
     */
    public static <T,R,T1,R1> void toPackDataList(List<T> list, Function<T,R> func,
                                                 List<T1> list1, Function<T1,R1> func1,
                                                 BiConsumer<T,List<T1>> action){
        if(CollectionUtils.isEmpty(list)||
                CollectionUtils.isEmpty(list1)){
            return;
        }
        //先通过key 组装数据
        Map<R1,List<T1>> dataMap=list1.stream().collect(
                Collectors.groupingBy(func1));
        list.forEach(row->{
            List<T1> t1=dataMap.get(func.apply(row));
            //不为空再塞值
            if(org.apache.commons.collections.CollectionUtils.isNotEmpty(t1)){
                action.accept(row, t1);
            }
        });

    }
    @Test
    public  void  func(){
        Personson personson = new Personson(1, true, "yyf",null);
        Person personson2 = new Person("yyf1", 1, true);
        Person personson3 = new Person("yyf2", 1, true);
        Person personson4 = new Person("0", 1, true);
        Person personson5 = new Person("1", 1, true);


        List<Person> personList = new ArrayList<>();
        personList.add(personson2);
        personList.add(personson3);
        personList.add(personson4);
        personList.add(personson5);
        List<Personson> personsonList = new ArrayList<>();
        personsonList.add(personson);
        toPackDataList(personsonList,Personson::getAge,personList,Person::getAge,Personson::setPersonList);
        System.out.println(personsonList);

    }




}
