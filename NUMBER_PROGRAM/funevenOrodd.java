package NUMBER_PROGRAM;
import java.util.Scanner;

public class funevenOrodd {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        oddeven(n);

    }

    public static void oddeven(int n) {
        if (n > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }

}
