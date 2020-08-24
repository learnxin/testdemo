package com.example.demo.lambda;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: wangran
 * @Description: ${description}
 * @Date: 2019/10/16 16:40
 */
@Slf4j
public class testdonggou {

    public static void main(String[] args) {
        int testtrycatch = testtrycatch();
        System.out.println(testtrycatch);
    }

    public static int testtrycatch(){

            try {
                String testv="yyf";
                System.out.println(testv);

                return testyyf();
            } catch (Exception e) {
                log.error("调用资质通过回调接口失败",e);
            }finally {
                System.out.println("final");
            }

return 0;
    }
    @Test
    public void testNull2Json(){
        String  str= "{\"uuid\":\"string\",\"extra\":{\"additionalProp1\":\"string\",\"additionalProp3\":\"string\",\"additionalProp2\":\"string\"},\"clientInfo\":{\"extra\":null,\"clientIp\":null,\"sourceApp\":\"bom\",\"userId\":\"10000018\",\"userName\":null},\"option\":null,\"id\":2,\"operId\":140065,\"write\":true,\"className\":\"cn.com.ocj.giant.center.vendor.api.dto.input.vcstore.command.WorkflowCallbackRpcCommand\"}";
        String remove = StringUtils.remove(str, "\\");
        System.out.println(remove);
        System.out.println(JSON.toJSONString(null));
    }

    private static int testyyf(){
        System.out.println("11111");
        return 0;
    }

    @Test
    public  void testDate(){
        Date date = new Date(1427888494711L);
        Date date1 = new Date(1585576552426L);
        System.out.println(date + "   "+date1);
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
        Person personson6 = new Person("1", 1, true);


        List<Person> personList = new ArrayList<>();
        personList.add(personson2);
        personList.add(personson3);
        personList.add(personson4);
        personList.add(personson6);
        List<Personson> personsonList = new ArrayList<>();
        personsonList.add(personson);
        toPackDataList(personsonList,Personson::getAge,personList,Person::getAge,Personson::setPersonList);
        System.out.println(personsonList);

    }
    @Test
    public void flapMap(){
        //流的扁平化
        Person personson2 = new Person("yyf1", 1, true);
        Person personson3 = new Person("yyf2", 1, true);
        Person personson4 = new Person("0", 1, true);
        Person personson6 = new Person("1", 1, true);


        List<Person> personList = new ArrayList<>();
        personList.add(personson2);
        personList.add(personson3);
        personList.add(personson4);
        personList.add(personson6);
        List<Person> personsonList = new ArrayList<>();
        personsonList.add(personson2);
        personsonList.add(personson3);
        personsonList.add(personson4);
        personsonList.add(personson6);
        Stream<Person> personStream = Stream.of(personList, personsonList,null)/*.filter(Objects::nonNull)*/.flatMap(List::stream);
//        List<Person> personStream1 = personStream.filter(Objects::nonNull).distinct().collect(Collectors.toList());

        List<Object> collect = personStream.filter(Objects::nonNull).distinct().collect(Collectors.toList());

        personsonList.stream().distinct();
        System.out.println(collect);

    }

    @Test
    public void testNpe(){
        Integer i = 1;
        Integer b = null;
        System.out.println(b<=i);
    }

    @Test
    public void sunnum(){
        String str="50765601,50766701,50767001,50767201,50783401,50304002,50765201,50766201,50766301,51002801,50765401,50767301,50766601,50766901,50773301,50743102,50787701,50784501,50766001,50783701,50765402";
        System.out.println(str.split(",").length);
    }

    @Test
    public void testinteqlInteger(){
        int i = 1;
        System.out.println(instanceofInteger(i));

    }
    private boolean instanceofInteger(Object obj){
        return obj instanceof Integer;
    }

    @Test
    public void testOutOfIndex(){
        List<String> objects = new ArrayList<>();
        String s = objects.get(0);
    }

    @Test
    public void testRemove(){
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(1);
        list2.add(5);
        list2.add(6);
        System.out.println(list2);
        boolean b = list2.removeAll(list1);
        System.out.println(list2);



    }

}
