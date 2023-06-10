import java.util.*;

public class FibonacciSeries{
    static void fib(int n){
        int k=0;
        int j=1;
        for(int i=0;i<n;i++){
            System.out.println(k);
            int sum=k+j;
            k=j;
            j=sum;
        }
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++){
            int n=Integer.parseInt(sc.nextLine());
            fib(n);
        }
    }
}