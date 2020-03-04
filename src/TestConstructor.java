public class TestConstructor {
    public static void main(String[] args) {
        Piont p = new Piont(3.0,4.0);
        Piont origin = new Piont(0.0,0.0);
        System.out.println(p.getDistance(origin));

    }

}

class Piont{
    double x,y;
    //构造方法名必须和类名一致
    public Piont(double _x,double _y){
        x=_x;
        y=_y;
    }
    public double getDistance(Piont pi){
        return Math.sqrt((x-pi.x)*(x-pi.x)+(y-pi.y)*(y-pi.y));
    }
}
//构造方法的重载，和一般方法的重载差不多
class user{
    int id;
    String name;
    String pwd;
    public user(){

    }
    public user(int id,String name){
        super();//可要可不要，构造方法的第一句总是super（）
        this.id = id;//this指的创建好的对象this.id指的是对象的id不是方法的id
        this.name = name;
    }public user(int id,String name,String pwd){
        super();//可要可不要
        this.id = id;//this指的
        this.name = name;
        this.pwd = pwd;
    }


}