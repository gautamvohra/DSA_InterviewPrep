import java.util.*;

public class PrimeTillN {
    static boolean Prime(int i) {
        if(i<2){
            return false;
        }
        if(i==2){
            return true;
        }
        for (int j = 2; j<=i/2; j++) {
            if(i%j==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        for(int i=0; i<t;i++){
            int n=Integer.parseInt(sc.nextLine());
            for(int j=0; j<n; j++){
                if(Prime(j)){
                    System.out.println(j+" is prime");
                }

        }
    }
}
}
 
