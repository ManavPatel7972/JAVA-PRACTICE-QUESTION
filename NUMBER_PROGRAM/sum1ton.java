package JavaBasic;
import java.util.*;
public class sum1ton {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int sum=0;
        int count=1;
        while(count<=n){
            sum=sum+count;
            count++;
        }
        System.out.println(sum);
    }
    
}
