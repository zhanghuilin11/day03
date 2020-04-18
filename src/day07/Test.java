package day07;

public class Test {
    //问题；想给test方法设置一个形参参数，这个参数不确定到底辉传进来一个什么类
    //可以确定的是传递实参一定会是一个类，呢么这个test方法的形参要设置什么类型？
    public void test(Object obj){
      //Object类是所有类的基类

    }

    public static void main(String[] args) {
        Test t = new Test();
        Person p = new Person();
        Student st = new Student();
        t.test(p);
        t.test(st);
        Person e = new Person();
        System.out.println(p.equals(st));
        System.out.println(p.equals(e));
        e = p;
        //为什么p可以执行object的方法？
        //因为object是所有类的父类，子类可以执行父类的方法
        System.out.println(p.equals(e));
        System.out.println(p.hashCode());
        System.out.println(e.hashCode());
        Object o =new Object();
        System.out.println(o.hashCode());
        System.out.println(p.toString());
    }

}
