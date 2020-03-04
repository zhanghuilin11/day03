public class testObject {
    public static void main(String[] args) {
        //Java中所有类的父类
//        Object obj;
        testObject to = new testObject();
        System.out.println(to.toString());
        Person2 p2 =new Person2();
        p2.name = "aa";
        p2.age = 23;
        System.out.println(p2.toString());
    }
    public String  toString(){
        return "测试object";
    }

}
class Person2{
    String name;
    int age;

    public  String toString(){
        return name +" ，年龄："+age;
    }
}