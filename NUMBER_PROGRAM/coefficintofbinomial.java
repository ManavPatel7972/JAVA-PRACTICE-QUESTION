package JavaBasic;
import java.util.*;
public class coefficintofbinomial {
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;

        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorial:");
        int n = sc.nextInt();
        int factorial = fact(n);
        
        System.out.println("enter a value of r");
        int r = sc.nextInt();
        int n_rf = fact(n-r);
        int rf = fact(r);

        float bc =(float) factorial/(n_rf * rf);
        System.out.println(bc);
        

    }
}
