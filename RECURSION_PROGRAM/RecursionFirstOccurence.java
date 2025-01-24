package RECURSION_PROGRAM;

/*
 WAP to find first occurence of an element in an arry 
 if key is found than return at index;
 if key is not found than return -1;
 */
import java.util.Scanner;

public class RecursionFirstOccurence {
    public static int firstOccurence(int arr[], int index, int key) {

        if (index == arr.length - 1) {
            return -1;
        }
        if (arr[index] == key) {
            return index;
        }

        return firstOccurence(arr, index + 1, key);

    }

    public static void main(String args[]) {

        // int arr[] = { 8, 3, 6, 9, 4, 10, 2, 0, 3 };
        // int i = 0;
        // int key = 5;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a arry size:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int index = 0;     //compulsary started with 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter a arry element:");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter a Key to be Find:");
        int key = sc.nextInt();


        System.out.println("result = " + firstOccurence(arr, index, key));
    }
}
