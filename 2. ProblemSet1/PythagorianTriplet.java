import java.util.*;

public class PythagorianTriplet {

    public static boolean pyth(int n1,int n2,int n3){
        if((n1*n1)==((n2*n2)+(n3*n3))){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        boolean flag=false;
        if(n1>n2){
            if(n1>n3){
                flag=pyth(n1,n2,n3);
            }
        }
        else if(n3<n2){
            flag=pyth(n2,n1,n3);
        }
        else{
            flag=pyth(n3,n1,n2);
        }
        System.out.println(flag);
    }
}
