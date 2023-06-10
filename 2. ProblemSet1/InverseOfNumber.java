import java.util.*;

public class InverseOfNumber {

    public static int count(int n){
        int dig=0;
        while(n!=0){
            dig++;
            n=n/10;
        }
        return dig;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        int k=count(n);
        int i=1;
        while(n!=0){
            if(n%10>k){
                ans=0;
                break;
            }
            ans+=Math.pow(10,(n%10)-1)*(i);
            i++;
            n=n/10;
        }
        System.out.println(ans);
    }
}
