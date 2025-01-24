import java.util.Scanner;

public class ReversArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[4];
        System.out.println("Enter the marks of 4 subjects: ");
        for (int i = 0; i < 4; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.print("Normal Order");
        for (int i = 0; i < 4; i++) {
            System.out.println(marks[i]);
        }
        System.out.print("Reverse Order");
        for (int i = 3; i >= 0; i--) {
            System.out.print(marks[i]);
        }
    }
}

