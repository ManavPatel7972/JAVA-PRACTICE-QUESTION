package NUMBER_PROGRAM;

//: WriteaJavaprogramtogetanumberfromtheuserandprintwhether it is
// positive or negative.
import java.util.*;

public class positiveornot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        String res = (n > 0) ? "positive" : "negative";
        System.out.println(res);

    }
}
