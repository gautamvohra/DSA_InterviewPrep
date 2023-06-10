import java.util.*;

public class AnyBaseToAnyBase {

    public static int convertd2a(int n,int b){
        int ans=0;
        int i=0;
        while(n!=0){
            ans+=(Math.pow(10, i))*(n%b);
            n=n/b;
            i++;
        }
        return ans;
    }

    public static int converta2d(int n,int b){
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
        int o=sc.nextInt();
        int b=sc.nextInt();

        int a2d=converta2d(n,o);
        int d2a=convertd2a(a2d,b);
        
        int ans=d2a;
        System.out.println(ans);
    }
}

