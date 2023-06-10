import java.util.*;

public class Variable {
    public static void main(String[] args) {
            int x=10;
            int y=20;
            System.out.println(x+y); 
            System.out.println(x*y); 

            // Priority List #BODMAS
            // (* / %) > (+ -)
            // If Same priority then use left to right solving principle
            int tryPrac =x*y/x+y;
            System.out.println(tryPrac);

    }
}
