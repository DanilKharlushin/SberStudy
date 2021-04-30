package com.comparators;

import java.util.Objects;

public class MyInteger {

    private Integer num;

    public MyInteger() {
    }

    public MyInteger(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyInteger myInteger = (MyInteger) o;
        return Objects.equals(num, myInteger.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }

    @Override
    public String toString() {
        return "MyInteger{" +
                "num=" + num +
                '}';
    }
}
