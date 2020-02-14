public class testMethod {
    //测试方法及方法的调用
    public static void main(String[] args) {
        //通过对象来调用普通方法
        //加了static的方法可以直接调用
        printX();
        testMethod tm = new testMethod();
        tm.printName();
        tm.add(2,3,4);
        int c = tm.add1(4,5,6)+23;
        System.out.println(c);
    }
    void printName(){
        System.out.println("方法调用测试》》》》");
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    int add1(int a,int b,int c){
        return a+b+c;  //return作用1、结束方法的运行，2、返回需要返回的值
    }
    public static void printX(){
        System.out.println("加了static的方法可以直接调用.....");
    }
}
