package com.day08;

public abstract class Animal {
    public abstract void test();
    public abstract void move();
    //抽象类中可以含有非抽象方法
    public void  jump(){
        System.out.println("jump!!!");
    }

}
class Dog extends Animal{

    @Override
    public void test() {
        System.out.println("sd");
    }

    @Override
    public void move() {
        System.out.println("Dog++++++跑");
    }
}
abstract class Fish extends Animal{
    //抽象类可以继承抽象类
    @Override
    public abstract void test();
    @Override
    public void move() {
        System.out.println("this is fish swing");
    }
}