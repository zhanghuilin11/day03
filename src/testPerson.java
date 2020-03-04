public class testPerson {

    public static void main(String[] args) {
        Person a = new Person();
        a.name= "zhang";
        a.age = 22;
        a.sex = "1";
        System.out.println(a.age);
        int newage = a.addage(3);
        System.out.println(a.age+";;;;;;"+newage );
        a.showage();
        a.study();

    }
}
