import java.util.*;

public class Factorial {

    public static int fac(int n1){
        int a=1;
        for(int i=1;i<=n1;i++){
            a*=i;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int ans=fac(n1);
        System.out.println(ans);
    }
}
