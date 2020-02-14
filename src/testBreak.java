public class testBreak {
    public static void main(String[] args) {
         //带标签的break,continue
        //打印101-150之间所有的质数:只能被1和它本身整除的数
        outer:
        for (int i = 101; i < 150; i++) {
            for(int j = 2;j<i/2;j++){
                if(i%j == 0){
                    continue outer;
                }
            }
            System.out.print(i+" ");
        }
    }
}
