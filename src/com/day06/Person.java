package com.day06;
//对类的属性封装和隐藏
public class Person {
    private int age;
    public void printAge(){
        System.out.println("年龄是："+this.age);
    }
    //setAge设置属性，getAge获取属性
    public void setAge(int a){
        if(a>0 && a<140){
            this.age = a;
        }
        else {
            System.out.println("输入的年龄有误");
        }
    }

    public int getAge() {
        return age;
    }
}
//四种权限修饰符
//private:本类内部使用
//default（或者不写）：本类内部，同一个包下
//protected:.................,子类
//public：。。。。。。。。。。。。。。。，任何地方
//一个Java文件可以有多个class，但是只能拥有一个public修饰的
