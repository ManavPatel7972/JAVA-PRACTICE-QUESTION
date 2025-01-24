package NUMBER_PROGRAM;
import java.util.*;
public class conditional_temp {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Temprature:");
        double temp = sc.nextDouble();
        String res= (temp>100)? "fever" : "don't fever";
        System.out.println(res);

    }
}