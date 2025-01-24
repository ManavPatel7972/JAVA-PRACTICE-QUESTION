package NUMBER_PROGRAM;
//:Write a program to find the factorialof any number entered by the user

import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find Factorial =");
        int fact = sc.nextInt();
        int i = 1;
        int ans = 1;

        while (i <= fact) {

            ans = ans * i;

            i++;

        }

        System.out.println("Factorial = " + ans);
    }
}
