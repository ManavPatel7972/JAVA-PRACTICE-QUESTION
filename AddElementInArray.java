/*
 Input:  Array: [ 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 ]
            Element: 50

Output: Array: [ 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 50 ]

Explanation:  Adding Element in the Array

 */

import java.util.Arrays;

public class AddElementInArray {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
        int element = 50;
        
        addElement(arr, element);

     }

    static void addElement(int[] arr, int element) {
        int[] newarr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];
        }
        newarr[arr.length] = element;

       
            System.out.println(Arrays.toString(newarr));
       
    }
}
