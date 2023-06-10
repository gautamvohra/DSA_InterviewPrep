import java.util.*;

public class PrimeFactorisation {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i = 2; i <Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=2;
        while(n!=0){
            if(isPrime(i)){
                while(n%i==0){
                    System.out.println(i);
                    n=n/i;
                }
            }
            i++;
        }
        
        
        
    }
}
