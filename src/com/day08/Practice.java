package com.day08;
//编写一个Employee类，声明为抽象类，包含如下三个属性；name,id,salary.
//提供必要的构造器和抽象方法work().对于Manager类来说
//他既是员工，还有奖金（bonus）属性。请使用继承的思想，设计CommonEmployee类和Manager类，要求类中提供必要的方法进行属性访问
public class Practice {
    public static void main(String[] args) {
        CommomEmployee c1 = new CommomEmployee();
        c1.SetCommomEmployeeInfo("aaa",123,3456);
        c1.work();
        c1.GetCommomEmployeeInfo();
        Manager m1 = new Manager();
        m1.SetManagerInfo("ccc",234,345,4567);
        m1.work();
        m1.GetManagerInfo();
    }

}
abstract class Employee{
    public Employee(){

    }
    String name;
    int id;
    double salary;



    public abstract void work();
}

class  CommomEmployee extends Employee{
    public void SetCommomEmployeeInfo(String name,int id,double salary){
        super.name = name;
        super.id = id;
        super.salary = salary;
    }
    public void  GetCommomEmployeeInfo(){
        System.out.println("CommomEmployee name = "+super.name);
        System.out.println("CommomEmployee id = "+super.id);
        System.out.println("CommomEmployee salary = "+super.salary);
    }
    @Override
    public void work() {
        System.out.println("CommomEmployee is working");
    }

}
class  Manager extends Employee{
    public void SetManagerInfo(String name,int id,double salary,double bonus){
        super.name = name;
        super.id = id;
        super.salary = salary;
        this.bonus = bonus;
    }
    double bonus;
    public void  GetManagerInfo(){
        System.out.println("Manager name = "+super.name);
        System.out.println("Manager id = "+super.id);
        System.out.println("Manager salary = "+super.salary);
        System.out.println("Manager bonus = "+this.bonus);
    }

    @Override
    public void work() {
        System.out.println("Manager is working");
    }
}