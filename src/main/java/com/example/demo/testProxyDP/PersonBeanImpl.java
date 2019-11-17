package com.example.demo.testProxyDP;

public class PersonBeanImpl implements PersonBean{

    private String name;
    private String sex;
    private String interst;
    private int rating;


    public PersonBeanImpl(String name, String sex, String interst, int rating) {
        this.name = name;
        this.sex = sex;
        this.interst = interst;
        this.rating = rating;
    }

    public PersonBeanImpl() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSex() {
        return sex;
    }

    @Override
    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String getInterst() {
        return interst;
    }

    @Override
    public void setInterst(String interst) {
        this.interst = interst;
    }

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public void setRating(int rating) {
        this.rating = rating;
    }
}
