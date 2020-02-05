import java.lang.reflect.Array;
import java.util.Arrays;//for swap(),displace()
public class testArrays {
    //定义一个二维数组并将数组中的元素呈梯形输出
    public static void trap() {
        System.out.println("定义一个二维数组并将数组中的元素呈梯形输出");
        int b[][] = new int[][]{{1},{2,3},{4,5,6}};
        for (int k = 0;k<b.length;k++){
            for (int c=0;c<b[k].length;c++){
                System.out.print(b[k][c]);
            }
            System.out.println();
        }
    }
    //输出三行四列且所有元素都为0的数组
    public static void matrix(){
        System.out.println("输出三行四列且所有元素都为0的数组");
        int a[][]=new int[3][4];
        for (int i = 0;i< a.length;i++){
            for (int j = 0;j<a[i].length;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
    //使用foreach语句遍历二维数组
    public static void tautog(){
        System.out.println("使用foreach语句遍历二维数组");
        int arr2[][] = {{2,3},{4,5}};
        System.out.println("数组中的元素是：");
        int i = 0;                                     //外层循环计数器变量
        for (int x[]:arr2){                            //外层循环变量为一维数组
            i++;                                        //外层计数器递增
            int j = 0;                                  //内层循环计数器变量
            for(int e:x){                               //循环遍历每一个数组元素
                j++;                                    //内层计数器递增
                if(i==arr2.length && j == x.length){    //判断变量是不是二维数组中的最后一个元素
                    System.out.print(e);                //输出二维数组中的最后一个元素
                }else
                    System.out.print(e + "、");          //输出信息
            }
        }
    }
    //使用fill(int[] a ,int value)方法填充数组元素

    public static void swap(){
        int arr[] = new int[5];
        Arrays.fill(arr,8);
        for (int a : arr){              //=for (int i=0;i<arr.length;i++)
            System.out.println(a);
        }

    }
    //使用fill(int[] a ,int fromindex,int toindex,int value)方法填充指定的数组元素，包含fromindex，不包含toindex
    public static void displace(){
        int arr[] = new int[]{2,3,4,5,6};
        Arrays.fill(arr,2,3,99);
        for(int x:arr){
            System.out.println("元素："+x);
        }

    }
    //对数组进行排序sort（）对数组进行升序排列
    public static void taxis(){
        int arr[] = new int[]{23,4,12,45,44};
        Arrays.sort(arr);
        for (int x:arr
             ) {
            System.out.print(x+",");
        }
    }
    //对数组进行复制copyOf(arr,newlength),copyOfRange(arr,int fromindex,int toindex)
    public static void cope(){
        int arr[] = new int[]{1,2,3,4,5,6};
        int newarr[] = Arrays.copyOf(arr,4);
        int newarr1[] = Arrays.copyOfRange(arr,2,5);//包括from，不包括to
        System.out.print("arr元素：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println();
        System.out.print("newarr元素：");
        for (int x:newarr
             ) {
            System.out.print(x+",");
        }
        System.out.println();
        System.out.print("newarr1元素：");
        for (int x:newarr1
             ) {
            System.out.print(x+",");
        }
    }
    //数组查询binarySearch(object[],object key[])
    public static void rakel(){
        int arr[] = new int[]{1,2,66,53,3,23,5,675,43};
        int index1 = Arrays.binarySearch(arr,4);
        int index2 = Arrays.binarySearch(arr,53);


    }
    public static void main(String[] args) {
//        trap();
//        matrix();
//        tautog();
//        swap();
//        displace();
//        taxis();
//        cope();
    }
}
