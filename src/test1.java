import java.util.Scanner;
//Scanner获取键盘输入
public class test1 {
    public static void main(String[] args){
        Scanner scnner = new Scanner(System.in);
        System.out.println("输入名字：");
        String name = scnner.nextLine();
        System.out.println(name);
    }
}
