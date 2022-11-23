package com.example.demo;

import com.example.demo.lambda.Person;
import org.junit.Test;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by crazyboy on 2018/2/2.
 */
public class testman {

    @Test
    public void test1(){
        minRunLength(100);
    }

    private  int minRunLength(int n) {
        assert n >= 0;
        int r = 0;      // Becomes 1 if any 1 bits are shifted off
        while (n >= 32) {
            r |= (n & 1);
            n >>= 1;
        }
        return n + r;
    }

    @Test
    public void testTimeSort(){
        List<Person> people = new ArrayList<>();
        Random random = new Random();
        Stream.iterate(0,x->x+1).limit(100).forEach(
                e-> people.add(new Person(random.nextInt(100)))
        );
        people.sort(Comparator.comparingInt(Person::getAge));

    }

    @Test
    public void testHashMap(){
        HashMap<String, Integer> intMap = new HashMap<>();
        intMap.put("22",22);
        Stream.iterate(0,x->x+1).limit(17).forEach(
                e -> {
                    if(e==11){
                        System.out.printf("");
                    }
                    intMap.put(String.valueOf(e),e);
                }
        );
        intMap.remove("22");
        for (Map.Entry entry:intMap.entrySet()
             ) {
            System.out.println(entry.getKey());
        }
    }

    @Test
    public void test2(){
        int c = 4;
        int b=3;

        int i =  c%b;
        int a = c&(b-1);
    }
    @Test
    public void test3(){
        String a = null;
        String c =  String.valueOf(a);
        HashMap<String, Object> map = new HashMap<>();
        map.put("one","one");
        String one = (String)map.get("one");
    }

    @Test
    public void initBooleanArray(){
        boolean[] test = new boolean[5];
        System.out.println(Arrays.toString(test));
    }

}

