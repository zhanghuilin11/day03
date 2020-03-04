package com.day06;
//一个Javabean：私有的属性，每个属性对应的get,set方法
public class Person1 {
    private String name;
    private int sex;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
    public int getSex() {
        return this.sex;
    }
}
