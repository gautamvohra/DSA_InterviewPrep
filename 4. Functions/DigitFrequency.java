import java.util.*;

public class DigitFrequency {

    public static int frq(int n1,int k){
        int a=0;
        while(n1!=0){
            if(n1%10==k){
                a++;
            }
            n1/=10;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int k=sc.nextInt();
        int ans=frq(n1,k);
        System.out.println(ans);
    }
}
