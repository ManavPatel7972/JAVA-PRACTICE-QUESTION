package NUMBER_PROGRAM;
// In a program, input 3 numbers : A, B and C. You have to output the average of 
//these 3 numbers. 

import java.util.*;
public class avrageof3number{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter a:");
        int a=sc.nextInt();
        System.out.println("eneter b:");
        int b=sc.nextInt();
        System.out.println("eneter c:");
        int c=sc.nextInt();

        float avg=(float)(a+b+c)/3;
        System.out.println( "avrage of number is = " + avg);


    }
    


}