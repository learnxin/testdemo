package com.example.demo.testProxyDP;

import java.lang.reflect.Proxy;

public class TestDemo {
    public static void main(String[] args) {
        TestDemo testDemo = new TestDemo();
        testDemo.test();

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
}
