public class test18 {

    public static void main(String args[]) {
        outer: for (int i = 101; i < 150; i++) {
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0){
                    continue outer;
                }
            }
            System.out.print(i + "  ");
        }
        System.out.println();
        //不用带标签的continue实现的方法
        for (int i = 101;i<150;i++){
            int sig = 0;
            for (int j=2;j< i / 2;j++){
                if(i % j == 0 ){
                    sig = 1;
                    continue;
                }
            }
            if (sig==0){
                System.out.print(i+"  ");
            }
        }
    }
}
