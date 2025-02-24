package JavaBasic;
import java.util.*;
public class largestof3 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a three number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("a is largest among three numbers:");

            }
            else{
                System.out.println("c is largest among three numbers:");
            }
        }
        else if(b>c){
            System.out.println("b is largest among three numbers:");
        }
        else{

            System.out.println("c is largest among three numbers:");

        }

    }
    
}
