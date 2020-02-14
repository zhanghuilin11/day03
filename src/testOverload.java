public class testOverload {
    //方法的重载;独立的完全不同的方法，只是名字一样
    //多个相同名称的方法如果在同一个类中共存//
// 那么这些同名方法一定是参数的个数或者参数的数据类型不一样
//这样的同名方法就叫做重载
    public static void main(String[] args) {
        testOverload to = new testOverload();
        System.out.println(to.add(2,3));
        System.out.println(to.add(2.3,4));
        System.out.println(to.add(3,4.5));
        System.out.println(to.add(2.3,4.5));
    }
    public int add(int x,int y){
        return x+y;
    }

    public double add(double x,int y){
        return x+y;
    }

    public double add(int x,double y){
        return x+y;
    }

    public double add(double x,double y){
        return x+y;
    }
}
