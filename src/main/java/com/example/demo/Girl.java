package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by crazyboy on 2017/11/18.
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class Girl {
    private String cupsize;
    private Integer age;
    private Double height;

    public String getCupsize() {
        return cupsize;
    }

    public void setCupsize(String cupsize) {
        this.cupsize = cupsize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "cupsize='" + cupsize + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
