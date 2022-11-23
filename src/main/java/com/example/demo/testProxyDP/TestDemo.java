package com.example.demo.testProxyDP;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;
import java.util.Date;
import java.util.regex.Pattern;

public class TestDemo {
    public static void main(String[] args) {
//        TestDemo testDemo = new TestDemo();
//        testDemo.test();
//        String pattern = "[a-z0-9\\-._~%!$&'()*+,;=:@/]*";
        String pattern = "/[a-zA-Z0-9\\&%_\\./-~-#]*";
        String content = "/index.html#/combinateItem";
        boolean matches = Pattern.matches(pattern, content);
        System.out.println(matches);

    }
    public PersonBean getOwnProxy(PersonBean personBean){
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),personBean.getClass().getInterfaces(),new OwnInvocationHandler(personBean));
    }
    private void test(){
        PersonBeanImpl personBean = new PersonBeanImpl("test","test","test",1);
        PersonBean ownProxy = getOwnProxy(personBean);
        String name = ownProxy.getName();
        System.out.println(name);
        ownProxy.setName("1111");
        System.out.println(ownProxy.getName());
        try {
            ownProxy.setRating(1);
        } catch (Exception e) {
            System.out.println("zzz");
        }
        System.out.println("owo");
    }
    @Test
    public void  ossSize(){
        String size = "e2a7c22b22184dc6a8fbb9cbb8023c8a.PNG";
        System.out.println( size.length() );
    }
    @Test
    public void newdate(){
        Date date = new Date(1593483577861L);
        Date date1 = new Date(1435803577861L);
        System.out.printf(date+""+date1);
    }

    @Test
    public void testand(){
        Integer one = 1;
        Integer two =2;
        Integer three =2;
        System.out.println(!one .equals(two));
        System.out.println(!one .equals(two) && one.equals(three));
        if(!one .equals(two) && one.equals(three)){
            System.out.println(111);
        }
    }

    @Test
    public void testMacth(){

    }
}
