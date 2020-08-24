package com.example.demo.lambda;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.junit.jupiter.api.Test;
import org.springframework.util.DigestUtils;
import sunbox.gateway.api.model.system.OperatorRespModel;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;

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


        Map<Integer, Integer> collect = strings.stream()
                .map(Integer::parseInt)
                .filter(this::isPrime)
                .distinct()
                .collect(Collectors.groupingBy(o -> o, Collectors.summingInt(o -> 1)));


//        Integer collect = strings.stream()
//                .map(Integer::parseInt)
//                .filter(this::isPrime)
//                .distinct()
//                .reduce(0, (x, y) -> x + y);
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
        arr11.flatMap(Arrays::stream).forEach(System.out::print);
    }

    @Test
    public void testSkip(){
        Stream<Integer> limit = Stream.iterate(1, x -> x + 1).limit(5);
        List<Integer> collect = limit
                .collect(Collectors.toList());
        limit.toArray(String[]::new);
        limit.toArray(Long[]::new);
//        Stream.of(arr1).skip(2).limit(2).forEach(System.out::println);
        Stream.iterate(1,x->x+2).skip(1).limit(5).forEach(System.out::println);
    }
    @Test
    public  void testSort(){
        List<Integer> collect = Stream.iterate(0, x -> x + 1).limit(5).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.print(collect);

    }

    @Test
    public void testlist(){
        ArrayList<Person> peoples = new ArrayList<>();
        peoples.add(new Person("00", 20, false));
        peoples.add(new Person("01", 19, true));
        Map<String, Person> collect = peoples.stream().collect(Collectors.toMap(Person::getName, person -> person));


        Object[] objects = peoples.stream()
            .map(Person::getName)
            .toArray();
        Stream<String> stringStream = peoples.stream()
            .map(Person::getName);
        TreeSet<Person> people = new TreeSet<Person>(peoples);




    }

    @Test
    public void longTest(){
        Long l = 7125676500L;
        int i = l.intValue();
        System.out.print(l);
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
        test.addAll(null);
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
                    if(key.equals("tes2")){
                        return;
                    }
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
    public void testString2Long(){
//        List<VcVendorCertBase> vcVendorCertBases=new ArrayList<>();
//        vcVendorCertBases.add(new VcVendorCertBase().setCertArea("1adda"));
//        vcVendorCertBases.add(new VcVendorCertBase().setCertArea(null));
//        vcVendorCertBases.add(new VcVendorCertBase().setCertArea("   "));
//        vcVendorCertBases.add(new VcVendorCertBase().setCertArea("124"));
//        Long[] longs = vcVendorCertBases.stream().map(VcVendorCertBase::getCertArea).filter(
//                e -> org.apache.commons.lang3.StringUtils.isNotBlank(e) && org.apache.commons.lang3.StringUtils.isNumericSpace(e)
//        ).map(Long::new).toArray(Long[]::new);
//
//        System.out.println(longs.toString());



    }

//    @Test
////    public void sizeIsEmpty(){
////        List<String> stringList=null;
////        boolean b = CollectionUtils. (stringList);
////        System.out.println(b);
////    }
    @Test
    public void testDateCompare(){
        List<Date> dates=new ArrayList<>();
        Date t1 = new Date();
        Date t2 = new Date();
        int i = t1.compareTo(t2);

        boolean before = t1.before(t2);
        dates.add(t1);
        dates.add(t2);
        Optional<Date> min = dates.stream().min(Date::compareTo);
        if(min.isPresent()){
            Date date = min.get();
        }



    }


    @Test
    public void test1(){

        String base = "10002111" +"1569558828449";
        String md5 = DigestUtils.md5DigestAsHex(base.getBytes());
        System.out.println(md5);

        String s = UUID.randomUUID().toString().replaceAll("-","");
        System.out.println(s);
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
        String test= "{\"uuid\":null,\"extra\":null,\"clientInfo\":{\"extra\":null,\"clientIp\":null,\"sourceApp\":\"cpm\",\"userId\":\"9999999\",\"userName\":\"9999999\"},\"option\":null,\"operId\":\"515335\",\"dataTableId\":22,\"dataTable\":\"vc_vendor_store_expand\",\"reviewStatus\":\"1\",\"data\":\"{\\\"decorationStatus\\\":1,\\\"id\\\":22}\",\"businessId\":\"2aa0f3897d0e47c7a443360399ca4a1a\",\"write\":true,\"className\":\"cn.com.ocj.giant.center.vendor.api.dto.input.workflow.DataHistUpdateCommand\"}";
//        test=test.replaceAll("\"","");
        test=test.replace("/\"/g","");
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

    @Test
    public void testV(){
        Boolean flag=false;
        Boolean flag1=false;
        System.out.println(flag^flag1);
    }

    @Test
    public void testParalles(){
        ArrayList<Integer> collect = Stream.iterate(0, e -> e + 1).limit(100).collect(toCollection(ArrayList::new));
        collect.parallelStream().forEach(e-> System.out.println(Thread.currentThread()));
    }



    @Test
    public void testUnique(){
        List<Person> books = Lists.newArrayList(new Person("1",1,Boolean.FALSE)
                ,new Person(null,2,Boolean.FALSE)
                ,new Person("1",3,Boolean.FALSE)
                ,new Person("2",2,Boolean.FALSE));

        //使用TreeSet去重
        List<Person> unique1 = books.stream().filter(e->StringUtils.isNotBlank(e.getName())) .collect(
                collectingAndThen(toCollection(() -> new TreeSet<>(Comparator.comparing(Person::getName))),
                        ArrayList::new));

        Comparator<Person> comparator1=Comparator.comparing(Person::getName);
        Comparator<Person> comparator=(o1,o2)->{

            if(Objects.equals(o1.getName(),o2.getName())
                    &&Objects.equals(o1.getWeeking(),o2.getWeeking())){
                return NumberUtils.INTEGER_ZERO;
            }
            return NumberUtils.INTEGER_MINUS_ONE;

        };

        List<Person> unique11 = books.stream().collect(
                collectingAndThen(toCollection(() -> new TreeSet<>(comparator)),
                        ArrayList::new));

        System.out.println(unique1);
        //使用map去重
        List<Person> unique2 = books.stream()
                .filter(distinctByKey(Person::getName))
                .collect(Collectors.toList());
        System.out.println(unique2);

    }



    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        System.out.println("这个函数将应用到每一个item");
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }


}
