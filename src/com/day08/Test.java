package com.day08;
//对象类型强制转换
public class Test {
    public static void main(String[] args) {
        //自动类型转换
//        int i = 10;
//        long l= i;
//        //强制类型转换
//        long k = 10;
//        int j  = (int)k;

//        Student s = new Student();
//        Person p = s; //从子类到父类的类型转换可以自动进行

//        Person p = new Person();
//        Student s = (Student) p;//从父类到子类的类型转换必须通过造型（强制类型转换）实现
        //无继承关系的类的强制转换是非法的
//        Test t =new Test();
//        Person p1 = t;//错误

//    Order o1 = new Order(123,"asd");
//    Order o2 = new Order(123,"asd");
//    System.out.println(o1.equals(o2));
//        System.out.println(Utils.isEmpty(null));
//        Chinese c1 = new Chinese();
//        Chinese c2 = new Chinese();
//        Chinese c3 = new Chinese();
//        Chinese c4 = new Chinese();
//        Chinese.showcount();
        Single s = Single.getInstance();
        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();

    }
}
