/*
 
Write a Java program to check if a number is a palindrome in Java? ( 121 is 
a palindrome, 321 is not) A number is called a palindrome if the number is equal to the reverse
 of a number e.g., 121 is 
a palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a 
palindrome because the reverse of 321 is 123, which is not equal to 321. 

 */

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number:");
        int n = sc.nextInt();

        if (isPalindromeNumber(n)) {
            System.out.println(n + " " + "is palindrome");
        } else {
            System.out.println(n + " " + "is not a palindrome");

        }

    }

    DOUBT chhe .....



    public static boolean isPalindromeNumber(int n) {
        int palindrome = n;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;

        }
        if(n == palindrome){
            return true;

        }
        return false;
    }

}
