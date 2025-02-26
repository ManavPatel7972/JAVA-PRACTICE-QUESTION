import java.util.Arrays;

// if given arr is sorted then removeDupicate elements ;;;;;
public class RemoveDuplicateSortedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 6, 6, 7 };
        System.out.println(Arrays.toString(removeDuplicate(arr)));
    }

    static int[] removeDuplicate(int[] arr) {
        int newsize = sizeOfNewArr(arr);
        int position = 1;

        int newarr[] = new int[newsize];

        newarr[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[i - 1]) {
                newarr[position] = arr[i];
                position++;
            }
        }
        return newarr;
    }

    static int sizeOfNewArr(int[] arr) {
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                count++;
            }
        }
        return count;
    }
}
