package com.example.demo.Algorithms.chapter1;

public class TestStatic {
    private static Integer one=222;
    private Boolean flag;

    public static Integer getOne() {
        return one;
    }

    public static void setOne(Integer one) {
        TestStatic.one = one;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }
}
