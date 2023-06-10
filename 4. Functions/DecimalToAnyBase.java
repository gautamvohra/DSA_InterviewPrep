import java.util.*;

public class DecimalToAnyBase {

    public static int convertd2b(int n,int b){
        int ans=0;
        int i=0;
        while(n!=0){
            ans+=(Math.pow(10, i))*(n%b);
            n=n/b;
            i++;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        int ans=convertd2b(n,b);
        System.out.println(ans);
    }
}
