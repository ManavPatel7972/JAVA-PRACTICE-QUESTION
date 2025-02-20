import java.lang.reflect.Array;
import java.util.Arrays;

public class MaximumIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 45, 56, 19 },
                { 35, 77, 305, 4 },
                { 98, 79, 54, 46 },
                { 12, 17 }
        };

        System.out.println("Maximum  = " + maxIn2dArray(arr));
    }

    static int maxIn2dArray(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
