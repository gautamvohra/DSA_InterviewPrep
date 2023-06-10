import java.util.*;

public class TakingInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  
        int i=Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        System.out.println("Hello "+s+" the counting is :");
        for(int j=0; j<i;j++){
            System.out.println(j);
        }
    }
}

