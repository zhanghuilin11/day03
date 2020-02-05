public class Person {
    public String name;
    public int age;
    public int sex;

    public void study(){
        System.out.println("studying");
    }

    public void showage(){
        System.out.println(age);

    }

    public int addage(int a){
        age = age + a;
        System.out.println(age);
        return age;

    }


}

