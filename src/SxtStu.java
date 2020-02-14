public class SxtStu {
    int id;
    String name;
    int age;
    Computer comp;
    void study(){
        System.out.println("我在学习，使用的电脑"+comp.brand);

    }
    void play(){
        System.out.println("我在玩游戏。。。。");
    }

    public static void main(String[] args) {
        SxtStu stu1 = new SxtStu();
        stu1.id = 0023;
        stu1.name = "张三";
        stu1.age = 22;
        //
        Computer comp1 = new Computer();
        comp1.brand = "华为";
        stu1.comp = comp1;
        //
        stu1.study();
        stu1.play();
    }
}
class Computer{
    String brand;//品牌
}