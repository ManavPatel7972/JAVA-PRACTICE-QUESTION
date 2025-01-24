
import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input an integer: ");
        int digits = sc.nextInt();

        System.out.println("The sum is " + digitsSum(digits));
    }

    public static int digitsSum(int n) {
        int sumOfDigits = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sumOfDigits += lastDigit;
            n /= 10;

        }
        return sumOfDigits;
    }

}

