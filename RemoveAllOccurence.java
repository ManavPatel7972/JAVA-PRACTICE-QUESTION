/*

 Explaination: all the occurrences of element 1 is removed from the array So, array becomes from
[ 1, 2, 1, 3, 5, 1 ]  to  , key = 1
Final result: [2, 3, 5]

 */

import java.util.Arrays;

public class RemoveAllOccurence {
    public static void main(String[] args) {
        int[] arr =  { 1, 2, 1, 3, 5, 1,5,3,6,7,5};
        int key = 5;
        System.out.println(Arrays.toString(removeOccurence(arr, key)));
    }

    static int[] removeOccurence(int[] arr , int key){
        int newSize = newSizeOfArry(arr, key);
        int newArr[] = new int[newSize];
        int position = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != key){
                newArr[position] = arr[i];
                position++;
            }
        }
        return newArr;
    }

    static int newSizeOfArry(int[] arr,int key){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != key){
                count++;
            }
        }
        return count;
    }
}
