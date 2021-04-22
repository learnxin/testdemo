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
        String  str= "{\"success\":true,\"data\":[{\"id\":208071,\"createTime\":\"2019-12-20T16:12:57.000+0000\",\"updateTime\":\"2019-12-20T16:12:57.000+0000\",\"updateId\":\"9999998\",\"createId\":\"9999998\",\"deleteYn\":0,\"employeeNo\":\"105336\",\"name\":\"家柱贸易（上海）有限公司（I/C）\",\"mobile\":null,\"enabled\":1,\"email\":\"\",\"phone\":\"\",\"metaData\":null,\"userId\":208071,\"remark\":null},{\"id\":208327,\"createTime\":\"2019-12-20T16:12:57.000+0000\",\"updateTime\":\"2019-12-20T16:12:57.000+0000\",\"updateId\":\"9999998\",\"createId\":\"9999998\",\"deleteYn\":0,\"employeeNo\":\"107078\",\"name\":\"嘉兴崇海置业有限公司\",\"mobile\":null,\"enabled\":1,\"email\":\"\",\"phone\":\"\",\"metaData\":null,\"userId\":208327,\"remark\":null},{\"id\":128694,\"createTime\":\"2020-09-10T05:14:00.000+0000\",\"updateTime\":\"2020-09-10T05:14:00.000+0000\",\"updateId\":\"zhangts_increment \",\"createId\":\"zhangts_increment \",\"deleteYn\":0,\"employeeNo\":\"690866\",\"name\":\"陈黄栋\",\"mobile\":null,\"enabled\":1,\"email\":\"shaofu@alibaba-inc.com\",\"phone\":\"15005815457\",\"metaData\":null,\"userId\":10003032,\"remark\":null},{\"id\":1003034,\"createTime\":\"2020-06-24T10:01:16.000+0000\",\"updateTime\":\"2020-06-24T10:01:16.000+0000\",\"updateId\":\"10003032\",\"createId\":\"10003032\",\"deleteYn\":0,\"employeeNo\":\"zmyx001\",\"name\":\"zmyx001\",\"mobile\":null,\"enabled\":1,\"email\":null,\"phone\":\"13918206564\",\"metaData\":null,\"userId\":10003032,\"remark\":null},{\"id\":1003167,\"createTime\":\"2020-07-23T09:37:20.000+0000\",\"updateTime\":\"2020-07-23T09:37:20.000+0000\",\"updateId\":\"10003165\",\"createId\":\"10003165\",\"deleteYn\":0,\"employeeNo\":\"shcxlp001\",\"name\":\"shcxlp001\",\"mobile\":null,\"enabled\":1,\"email\":null,\"phone\":\"18516218581\",\"metaData\":null,\"userId\":10003165,\"remark\":null},{\"id\":1003326,\"createTime\":\"2020-08-22T13:50:52.000+0000\",\"updateTime\":\"2020-08-22T13:50:52.000+0000\",\"updateId\":\"10003324\",\"createId\":\"10003324\",\"deleteYn\":0,\"employeeNo\":\"shwm001\",\"name\":\"shwm001\",\"mobile\":null,\"enabled\":1,\"email\":null,\"phone\":\"18918577180\",\"metaData\":null,\"userId\":10003324,\"remark\":null},{\"id\":1003398,\"createTime\":\"2020-09-07T12:43:32.000+0000\",\"updateTime\":\"2020-09-07T12:43:32.000+0000\",\"updateId\":\"10003396\",\"createId\":\"10003396\",\"deleteYn\":0,\"employeeNo\":\"项上吉祥\",\"name\":\"项上吉祥\",\"mobile\":null,\"enabled\":1,\"email\":null,\"phone\":\"13915529322\",\"metaData\":null,\"userId\":10003396,\"remark\":null},{\"id\":1003482,\"createTime\":\"2020-09-15T07:41:26.000+0000\",\"updateTime\":\"2020-09-15T07:41:26.000+0000\",\"updateId\":\"10003525\",\"createId\":\"10003525\",\"deleteYn\":0,\"employeeNo\":\"13916914292\",\"name\":\"13916914292\",\"mobile\":null,\"enabled\":1,\"email\":null,\"phone\":\"13916914292\",\"metaData\":null,\"userId\":10003525,\"remark\":null},{\"id\":1003507,\"createTime\":\"2020-09-22T02:43:11.000+0000\",\"updateTime\":\"2020-09-22T02:43:11.000+0000\",\"updateId\":\"10003550\",\"createId\":\"10003550\",\"deleteYn\":0,\"employeeNo\":\"昆山和融房地产开发有限公司\",\"name\":\"昆山和融房地产开发有限公司\",\"mobile\":null,\"enabled\":1,\"email\":null,\"phone\":\"15995599668\",\"metaData\":null,\"userId\":10003550,\"remark\":null},{\"id\":1003509,\"createTime\":\"2020-09-22T03:29:39.000+0000\",\"updateTime\":\"2020-09-22T03:29:39.000+0000\",\"updateId\":\"10003552\",\"createId\":\"10003552\",\"deleteYn\":0,\"employeeNo\":\"米牛文化传媒（江苏）有限公司\",\"name\":\"米牛文化传媒（江苏）有限公司\",\"mobile\":null,\"enabled\":1,\"email\":null,\"phone\":\"13817860536\",\"metaData\":null,\"userId\":10003552,\"remark\":null},{\"id\":1003510,\"createTime\":\"2020-09-22T05:30:37.000+0000\",\"updateTime\":\"2020-09-22T05:30:37.000+0000\",\"updateId\":\"10003553\",\"createId\":\"10003553\",\"deleteYn\":0,\"employeeNo\":\"shyt001\",\"name\":\"shyt001\",\"mobile\":null,\"enabled\":1,\"email\":null,\"phone\":\"15802150309\",\"metaData\":null,\"userId\":10003553,\"remark\":null}],\"fail\":null}";
        String remove = StringUtils.remove(str, "\\");
        System.out.println(remove);
        System.out.println(JSON.toJSONString(null));
    }

    @Test
    public void testnn2Json(){
        String  str= "query ($context: RcLlsfContext!, $options: String!) {\\n  listRuProduct(context: $context, options: $options) {\\n    pagination {\\n      total\\n      totalPage\\n      pageSize\\n      currentPage\\n    }\\n    data {\\n      uuid\\n      orderUuid\\n      order {\\n        uuid\\n        orderType\\n        changeScene\\n      }\\n    }\\n  }\\n}\\n";
        String remove = StringUtils.remove(str, "\\n");
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
        Stream<Person> personStream = Stream.of(personList, personsonList,null).filter(CollectionUtils::isNotEmpty).flatMap(List::stream);
//        List<Person> personStream1 = personStream.filter(Objects::nonNull).distinct().collect(Collectors.toList());

        List<Object> collect = personStream./*filter(Objects::nonNull).*/distinct().collect(Collectors.toList());

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
    @Test
    public void test(){
        System.out.println(false != true);
    }
}
