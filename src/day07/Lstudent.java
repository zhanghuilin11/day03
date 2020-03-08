package day07;

public class Lstudent extends Student {


    @Override
    public void showinfo() {
        super.showinfo();

    }

    public static void main(String[] args) {
        Lstudent lst = new Lstudent();
        lst.school="sdda";
        lst.age=12;
        lst.name="sdaww";
        lst.sex =1;
        lst.showinfo();
    }
}
