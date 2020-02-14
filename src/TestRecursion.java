public class TestRecursion {
    //递归，自己调用自己
    //必须定义递归头（什么时候不调用自己）和递归体
    public static void main(String[] args) {
//        a();
        int n =20;
        long d1 = System.currentTimeMillis();
        System.out.printf("%d的阶乘的结果%s\n",n,factorial(n));
        long d2 = System.currentTimeMillis();
        System.out.printf("递归耗时：%s\n",d2-d1);
        //递归占用资源较多，不宜使用，循环更好
        long d3 = System.currentTimeMillis();
        System.out.printf("%d的循环阶乘的结果%s\n",n,factorial1(n));
        long d4 = System.currentTimeMillis();
        System.out.printf("循环递归耗时：%s\n",d4-d3);

        //求斐波那契数列
        int fb = 91;
        long d5 = System.currentTimeMillis();
        System.out.printf("%S第项斐波那契数列为%s\n",fb,Fibonacci(fb));
        long d6 = System.currentTimeMillis();
        System.out.printf("循环耗时：%s\n",d6-d5);
    }
    static int count = 0;
    static void a(){
        System.out.println("a");

        b();
        count ++;
        if (count <10){
            a();
        }
        else {
            return;
        }
    }
    static void b(){
        System.out.println("b");
    }
    //求阶乘
    static long factorial(int a){
        if (a==1){
            return 1;
        }
        else {
           return a * factorial(a-1);
        }
    }
    //使用while循环求阶乘
    static long factorial1(int a ){
        long result = 1;
        while (a>1){
            result =result*a;
            a--;
        }
        return result;
    }
    //求斐波那契数列
    static long Fibonacci(int a){
        long b = 1;
        long c = 1;
        long d = 0;
        System.out.print(1+" "+1+" ");
        if (a > 2){
            while (a>1){
                d = b+c;
                System.out.print(d+" ");
                a--;
                b = c;
                c = d;
            }
        }
        else {
            return 1;
        }
        System.out.println();
        return d;
    }
}
