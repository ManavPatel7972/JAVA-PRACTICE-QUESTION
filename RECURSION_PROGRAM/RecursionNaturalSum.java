package RECURSION_PROGRAM;
public class RecursionNaturalSum {
    public static int naturalSum(int n) {

        if(n==1){
            return 1;
        } 
        else{
            return n + naturalSum(n-1);
        }
    }

    public static void main(String args[]){

        int n= 5;

        System.out.println(naturalSum(n));
    }
}
