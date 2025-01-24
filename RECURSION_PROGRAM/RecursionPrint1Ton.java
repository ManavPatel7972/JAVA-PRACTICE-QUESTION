package RECURSION_PROGRAM;
public class RecursionPrint1Ton {
    public static void print1ton(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }

        print1ton(n - 1);
        System.out.println(n);

    }

    public static void main(String args[]) {
        int n = 10;
        print1ton(n);

    }
}