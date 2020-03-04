//测试重写父类方法
public class testOverride {
    public static void main(String[] args) {
        student st1 = new student();
        st1.age = 12;
        st1.name = "三种";
        st1.sex = "男";
        st1.study();

    }
}
class student extends Person{
    public void study(){
        System.out.println("I am studying...");
    }

}