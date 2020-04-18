package com.day08;

public class Chinese {
    public Chinese(){
        this.count = this.count +1;
    }
    static String country;
    public static int count;//记录Chinese这个类被new了多少次
    //静态的变量可以直接通过类来访问，静态方法也是这样
    String name;
    int age;

    public static  void test(){
        System.out.println("这是一个静态方法");
    }
    public static void  showcount(){
        System.out.println("总共new了"+count+"个对象");
    }

}
