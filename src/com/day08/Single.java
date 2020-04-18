package com.day08;

public class Single {

    //实现一个饿汉式的单例
    //私有的构造
    private Single(){
        //构造方法私有化，调用这个类的人不能直接使用new来创建对象

    }
    //私有的Single类型的类变量
    private static Single single = new Single();

    public static Single getInstance(){
        return single;
    }
}
