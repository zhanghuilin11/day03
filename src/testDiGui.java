//测试递归
public class testDiGui {
    public static void main(String[] args){
    System.out.println(a(10));
    System.out.println(b(10));

    }
    //y用递归完成阶乘
    static long a(long n){
        if (n==1){
            return n;
        }
        else {
            n=n*a(n-1);
        }
        return n;
    }
    //用循环完成阶乘
    static long b(long n){
        long res = 1;
        while (n>1){
            res = n*res;
            n--;
        }
        return res;
    }
}
