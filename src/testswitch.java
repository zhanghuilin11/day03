
public class testswitch {
    public static void main(String[] args){
        int a = (int)(Math.random()*6+1);
        switch (a){
            case 1:
                System.out.println("这是1");
                break;
            case 2:
                System.out.println("zheshi2");
                break;
            default:
                System.out.println("ssssssssssssssssssssssss");
                break;
        }
        System.out.println(a);
    }
}

