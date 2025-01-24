package NUMBER_PROGRAM;
// WriteaprogramtoprintthemultiplicationtableofanumberN,enteredbythe user.

import java.util.Scanner;

public class MultipicationTable {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :");
        int n = sc.nextInt();

        // for (int i = 1; i <= 10; i++) {
        // System.out.println(n + " * " + i + " = " + (n*i));
        // }

        int i = 1;
        while (i <= 10) {

            System.out.println(n + " * " + i + " = " + (n * i));
            i++;

        }
    }

}
