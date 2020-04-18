package day07;

public class Student extends Person {
    String school;


    @Override
    public void showinfo() {
        super.showinfo();
        System.out.println("school = " + school);
    }

    public static void main(String[] args) {
        Student stu = new Student();
        Person p = new Person();
        Person p1 = new Student();
        stu.school="123";
        stu.age = 23;
        stu.name="asd";
        stu.sex=1;
        stu.showinfo();
        //x instanceof A 检验x是否是A的对象，返回值为boolen型
        System.out.println(stu instanceof Person);
        System.out.println(stu instanceof Student);
        System.out.println(p instanceof Student);
        System.out.println(p1 instanceof Person);
        System.out.println(p1 instanceof Student);
    }
}
