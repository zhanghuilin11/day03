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
        stu.school="123";
        stu.age = 23;
        stu.name="asd";
        stu.sex=1;
        stu.showinfo();
    }
}
