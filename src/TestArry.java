public class TestArry {

    //数组

    public static void main(String[] args){
        int a[]={31,28,31,30,31,30,31,31,30,31,30,31};
//        for (int i=0;i<12;i++){
//            System.out.println((i+1)+"月有"+a[i]+"天");
//        }
        //Matrix();
        Tautog();
    }
    public static void Matrix(){
        //int a[][] = new int[3][4];
        int a[][] = {{1,2,3,4},{2,3,4,5},{3,4,5,6}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
    }
    public static void Tautog(){
        int a[][] = {{1,2,3,4},{2,3,4,5},{3,4,5,6}};
        System.out.println("数组中的元素是：");
        int i = 0;
        for(int x[]:a){
            i++;
            int j=0;
            for(int e:x){
                j++;
                if(i == a.length&& j==x.length){
                    System.out.println(e);
                }else
                    System.out.print(e+"、");
            }
        }
    }
}
