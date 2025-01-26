package RECURSION_PROGRAM;
public class RecursionProductOfDigits {
    public static int productOfDigit(int number) {
        
        if(number%10 == number){
            return number;
        }
       
        return (number%10) * productOfDigit(number/10); 

    }
    public static void main(String[] args) {
        int number = 1342;
        int res = productOfDigit(number);
        System.out.println("Product of Digits = " +res);
    }
}
