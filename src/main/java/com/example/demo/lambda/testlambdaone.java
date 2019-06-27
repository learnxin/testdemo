package com.example.demo.lambda;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;
import sunbox.gateway.api.model.system.OperatorRespModel;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.beans.BeanUtils;

@Slf4j
public class testlambdaone {

    public static void main(String[] args) {
//        Object o=(Runnable)()->{
//            System.out.println("zzz");
//        };
//        ((Runnable) o).run();
//        o=new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        };

//       Object o=(Function) (x)->{
//           return x.toString();};
//        System.out.println( ((Function) o).apply(1));

//        Runnable o=()->{
//            System.out.println("1111");
//        };

//        Predicate xx=(x)->{
//           return x instanceof String?true:false;
//        };
//
//
//
//        Thread yyf = new Thread(
//                () -> {
//                    System.out.println("yyf");
//                }
//        );
        testlambdaone testlambdaone = new testlambdaone();
        String[] strs=new String[100];
        for (int i = 0; i < strs.length; i++) {
            strs[i]=(int) (Math.random() * 100 + 1)+"";

        }




        testlambdaone.distinctPrimary(strs);
    }

    public void distinctPrimary(String[] strs){
        List<String> strings = Arrays.asList(strs);

//        List<Integer> collect = strings.stream()
//                .map(o -> Integer.parseInt(o))
//                .filter(o -> isPrime(o))
//                .distinct()
//                .collect(Collectors.toList());


//        Map<Integer, Integer> collect = strings.stream()
//                .map(o -> Integer.parseInt(o))
//                .filter(o -> isPrime(o))
////                .distinct()
//                .collect(Collectors.groupingBy(o -> o, Collectors.summingInt(o -> 1)));


        Integer collect = strings.stream()
                .map(Integer::parseInt)
                .filter(this::isPrime)
                .distinct()
                .reduce(0, (x, y) -> x + y);
        System.out.println(collect);
    }



    public boolean isPrime(int i){
        for (int j = 2; j < i/2; j++) {
            if(i%j==0){
                return false;
            }
        }
        return true;
    }

    @Test
    public void testFlapMap1() {
        String[] arr1 = {"a", "b", "c", "d"};
        String[] arr2 = {"e", "f", "c", "d"};
        String[] arr3 = {"h", "j", "c", "d"};
        // Stream.of(arr1, arr2, arr3).flatMap(x -> Arrays.stream(x)).forEach(System.out::println);
        Stream<String[]> arr11 = Stream.of(arr1, arr2, arr3);
        arr11.flatMap(Arrays::stream).forEach(System.out::println);
    }

    @Test
    public void testSkip(){
//        Stream.of(arr1).skip(2).limit(2).forEach(System.out::println);
        Stream.iterate(1,x->x+2).skip(1).limit(5).forEach(System.out::println);
    }

    @Test
    public void testlist(){
        ArrayList<Person> peoples = new ArrayList<>();
     peoples.add(new Person("00", 20, false));
     peoples.add(new Person("01", 19, true));
        Object[] objects = peoples.stream()
                .map(Person::getName)
                .toArray();
        Stream<String> stringStream = peoples.stream()
                .map(Person::getName);
        TreeSet<Person> people = new TreeSet<Person>(peoples);
//        AtomicReference<String> test= new AtomicReference<>("");
//     people.forEach(x->{
//         test.updateAndGet(v -> v + x);
//         System.out.println(test);
//     });

    }
    @Test
    public void testArraySteam(){
        String[] strings = {"1", "2", null, null};
        String[] strings1 = Arrays.stream(strings).filter(
                o -> !StringUtils.isEmpty(o)
        ).toArray(String[]::new);


    }

    @Test
    void testContainArray(){
        Integer[] ints={3,10,11};
        List<Integer> integers = Arrays.asList(ints);
        Integer i=21;
        boolean contains = integers.contains(i);
        System.out.println(contains);
    }

    @Test
    public void testListSteam(){
        List<String> test=new ArrayList<>();
        test.add("121244");
        test.add("1212");
        test.add("121233");

        String s = jointList(test);
        System.out.println(s);
//        String str="1233";
//        String[] split = str.split(",");

    }

    @Test
    public void testMapForeach(){
        Map<String,Object> map=new HashMap<>();
        map.put("tes1","value");
        map.put("tes2","value2");
        map.forEach(
                (key,value)->{
                    log.info("key：" + key + " value："
                            + value);
                    map.put(key," 参数值："
                            + value);
                }

        );
        System.out.println(map);

    }

    private String jointList(List<String> list){
        StringBuilder sb = new StringBuilder(list.size() *3);
        int offset = list.size() - 1;
        for( int i = 0; i < offset; i++ )
        {
            sb.append(list.get(i)).append(",");
        }
        sb.append(list.get(offset));

        return sb.toString();
    }

    @Test
    public void testjwt(){
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("00", 20, false));
        people.add(new Person("01", 19, true));
        log.info("accesstoken获取状态status:{}**info:{}**result:{}",1,null,"success");
        JwtUtil jwtUtil = new JwtUtil();
        HashMap<Object, Object> claim = new HashMap<>();
        claim.put("test",people);
        String s = jwtUtil.generateToken(claim);
        Map<String, Object> stringObjectMap = jwtUtil.validateToken(s);
//        System.out.println(stringObjectMap);
    }

    @Test
    public void test(){
        OperatorRespModel operatorRespModel = new OperatorRespModel();
        JSONObject jsonObject = JSON.parseObject(JSON.toJSONString(operatorRespModel));
//        com.ad.platform.kedong.vo.OperatorRespModel operatorRespModel1 = (com.ad.platform.kedong.vo.OperatorRespModel) operatorRespModel;\
        Map map=(Map<String,Object>)operatorRespModel;
        System.out.println(map);

    }
    @Test
    public void testjson(){
        String test=null;
        String s = JSON.toJSONString(test);
        JSONObject jsonObject = JSON.parseObject(s);
        System.out.println(jsonObject);

    }

    @Test
    public void teststring(){
        String test="\"testyyf\"";
        test=test.replaceAll("\"","");
//        test=test.replace("/\"/g","");
        System.out.println(test);

    }


    @Test
    public void testreg(){
        String qq = "12345664a@";
//        String qq = "nrad@_1";

        String regex = "[1-9]\\d{4,14}";
        //1到20位非空字符
        String reg1="\\S{1,20}";
        String reg2="^[a-zA-Z]+$";
        String reg3="^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[_])[A-Za-z0-9._~!@#$^&*]{6,16}$";
        String reg4="^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[_])[A-Za-z0-9_]{6,16}$";
        //密码必须由字母、数字、特殊符号组成，区分大小写
        String reg5="^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[._~!@#$^&*])[A-Za-z0-9._~!@#$^&*]{8,20}$";
        boolean flag = qq.matches(reg3);
        System.out.println(flag);

    }




}
