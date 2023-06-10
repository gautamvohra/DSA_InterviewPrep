import java.util.*;

public class AnyBaseToDecimal {

    public static int convert(int n,int b){
        int ans=0;
        int i=0;
        while(n!=0){
            ans+=(Math.pow(b, i))*(n%10);
            n=n/10;
            i++;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        int ans=convert(n,b);
        System.out.println(ans);
    }
}
