package RECURSION_PROGRAM;
public class RecursionFiconacci {
    public static int fibbo(int n) {

        if(n==1 || n==0){
            return n;
        }
        else{
            return fibbo(n-1) + fibbo(n-2);
        }
    }

    public static void main(String args[]) {

        int n = 7;
        System.out.println(fibbo(n));
    }
    
}
