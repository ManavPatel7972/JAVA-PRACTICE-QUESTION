package RECURSION_PROGRAM;

public class RecursionSumOfDigits {

    public static int sumOfDigit(int number) {
        
        if(number == 0){
            return 0;
        }
       
        return (number%10) + sumOfDigit(number/10); 

    }
    public static void main(String[] args) {
        int number = 1342;
        int res = sumOfDigit(number);
        System.out.println("Sum of Digits = " +res);
    }
}
