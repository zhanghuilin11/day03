import sun.security.krb5.internal.crypto.EType;

import java.util.Arrays;

public class TestString {
    public static void main(String[] args){

        //字符串的创建
//        char a[]={'c','h','i','n','a'};
//        String s = new String(a);
//        String s1 = "china";
//        System.out.println("s---->"+s);
//        System.out.println("s1---->"+s1);

        //使用字符数组的一部分创建字符串
//        char a1[]={'c','h','i','n','a'};
//        String ss = new String(a1,1,3);
//        System.out.println(ss);

        //字符串的连接
//        String a="build ";
//        String b="completed ";
//        String c=a+b+"successfully ";
//        String d=c+1234;
//        System.out.println(c);
//        System.out.println(d);

        //获取字符串长度
//        String a="build ";
//        String b="comp leted ";
//        System.out.println("a的长度为："+a.length());
//        System.out.println("b的长度为："+b.length());

        //字符串查找
//        String b="comp leted ";
//        System.out.println(b.indexOf(""));
//        System.out.println(b.indexOf("e"));
//        System.out.println(b.lastIndexOf(""));
//        System.out.println(b.length());
//        System.out.println(b.lastIndexOf("e"));

        //获取指定位置的字符串
//        String b="comp leted ";
//        System.out.println(b.charAt(3));
//        System.out.println(b.substring(2,8));

        //去除空格
//        String b=" comp leted ";
//        System.out.println(b);
//        System.out.println(b.length());
//        System.out.println(b.trim());
//        System.out.println(b.trim().length());

        //字符串替换
//        String b=" comp leted ";
//        System.out.println(b);
//        //替换单个字符
//        System.out.println(b.replace('e','T'));
//        //替换字符串
//        System.out.println(b.replace("et","asd"));
//        //无目标oldChar则返回原字符串
//        System.out.println(b.replace("jk","sd"));
//        //利用replace（）去除字符串中的空格
//        System.out.println(b.replace(" ",""));

        //判断字符串的开始与结尾
//        String b="c omp let ed";
//        System.out.println(b.startsWith("c"));
//        System.out.println(b.startsWith("c o"));
//        System.out.println(b.startsWith("co"));
//        System.out.println(b.endsWith("ed"));

        //判断字符串是否相等
//        String b=" comp let ed ";
//        String b1=" comp leted ";
//        String b2=" comp leted ";
//        String b3=" COMP let ed ";
//        System.out.println(b1.equals(b));
//        System.out.println(b1.equals(b2));
//        System.out.println(b.equals(b3));
//        //equalsIgnoreCase()可以忽略字符串的大小写进行比较
//        System.out.println(b.equalsIgnoreCase(b3));

        //字符串分割
        String a = "192.168.1.123";
        System.out.println(a);
        String[] arry =a.split("\\.");
        System.out.println(Arrays.toString(arry));
        System.out.println("####################");
        //分割为3个元素
        String[] arry1 =a.split("\\.",3);
        System.out.println(Arrays.toString(arry1));
        System.out.println("####################");
        //测试分割限制次数大于可分割次数
        String[] arry2 =a.split("\\.",6);
        System.out.println(Arrays.toString(arry2));



    }
}
