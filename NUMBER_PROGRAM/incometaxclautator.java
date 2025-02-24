package JavaBasic;
import java.util.*;
public class incometaxclautator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a income:");
        float income = sc.nextFloat();
        float tax;

        if(income<500000){
            tax=0.0f;
        }
        else if(income>=500000 && income<1000000){
            tax=income*0.2f;

        }
        else{
            tax=income*0.3f;
        }

        System.out.println(tax);

    }
    
}
