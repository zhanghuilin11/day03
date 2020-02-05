public class testwhile {
    public static void main(String[] args){
        int a = 1;
        a = 99;
        int i = 0;
        int j = 0;
        int sum = 0;
        int sum1 = 0;
        while (i <= a){
            sum = sum + i;
            i++;

        }
        System.out.println(sum);
        //do...while没必要用
        do {
            sum = sum+j;
            j++;
        }while (j < a);

        //for (初始表达式；布尔表达式；迭代因子)
        //{ 循环体；}
        for(int k = 0;k<=a;k++){
            sum1 = sum1 + k;


        }
        System.out.println(sum1);
    }
}
