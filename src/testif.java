//if语句练习
public class testif {
    public static void main(String[] args){
        double d = Math.random();//产生一个0-1之间的随机数
        System.out.println(d);
        int i = (int)(6*Math.random()+1);
        if(i<3){
            System.out.println(i);
            System.out.println("小");
        }
        System.out.println((int)(6*Math.random()));
        System.out.println("########################################");
        int a = (int)(Math.random()*6+1);
        int b = (int)(Math.random()*6+1);
        int c = (int)(Math.random()*6+1);
        int res = a+b+c;
        if(res>15){
            System.out.println("今天运气不错！");
            System.out.println(res);
        }
        else if (11 <= res & res < 15){
            System.out.println("今天运气一般");
            System.out.println(res);
        }
        else {
            System.out.println("今天运气不好");
            System.out.println(res);
        }
        System.out.println((int)7.9);//int取值测试
    }

}
