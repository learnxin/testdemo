package com.example.demo.TestAnnotation;

import java.lang.annotation.*;

/**
 * @Author: wangran
 * @Description: annotationtest
 * @Date: 2019/7/5 20:12
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Dict {
     String srcField();
     String dictType();
}
