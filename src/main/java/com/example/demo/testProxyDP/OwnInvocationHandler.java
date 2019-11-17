package com.example.demo.testProxyDP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnInvocationHandler implements InvocationHandler {

    PersonBean personBean;

    public OwnInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Exception {

        try {
            if(method.getName().startsWith("get")){
               return method.invoke(personBean,args);
            }
            if(method.getName().equals("setRating")){
                throw new IllegalAccessException();
            }
            if(method.getName().startsWith("set")){
               return method.invoke(personBean,args);

            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }
}
