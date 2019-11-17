package com.example.demo.TestAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: wangran
 * @Description: ${description}
 * @Date: 2019/7/5 20:32
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface testAnnotation {
    String value()default "test" ;
}
