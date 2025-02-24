package JavaBasic;
import java.util.*;
public class print1ton {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enyer a number:");
        
        int n= sc.nextInt();

        int count=1;

        while(count<=n){
            System.out.println(count);
            count++;

        }

    }
}
