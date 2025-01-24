package RECURSION_PROGRAM;
public class RecursionPrintReverseNumber {
    public static void reverseOrder(int n){
       if(n==1){
        System.out.print(n);
        return;
       }
       System.out.print(n + " ");
       reverseOrder(n-1);
    } 

    public static void main(String args[]){

        int n = 10;
        reverseOrder(n);
        
    }
}
