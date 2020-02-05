public class testproject01 {
    //属性
    String name;
    int nl;
    String xh;
    Computer comp;
    //方法
    void study(){
        System.out.println("我在学习JAVA" + comp.brand);
    }
    void play(){
        System.out.println("我在玩游戏");
    }
    public static void main(String[] args){
        testproject01 stu = new testproject01();
        stu.xh="1234";
        stu.name="zsfg";
        stu.nl=23;
        Computer ca= new Computer();
        ca.brand = "hjkdl";
        stu.comp = ca;
        stu.play();
        stu.study();
    }
}

class Computer{
    String brand;
}