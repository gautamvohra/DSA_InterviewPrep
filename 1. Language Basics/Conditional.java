import java.util.*;

public class Conditional {
    public static void main(String[] args) {
        int n1=20;
        int n2=23;
        if(n1==n2){
            System.out.println(n1 + " is equal to " + n2);
        }
        else{
            if(n1>n2){
                System.out.println(n1 + " is greater to " + n2);
            }
            else{
                System.out.println(n2 + " is greater to " + n1);
            }
        }
        if(n1>n2){
            System.out.println("Task Done");
        }
        
    }
}
