public class 方法重载 {
    //多个相同名称的方法如果在同一个类中共存//
// 那么这些同名方法一定是参数的个数或者参数的数据类型不一样
//这样的同名方法就叫做重载

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

