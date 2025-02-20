// Find Numbers  with Even Numers of digits;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NumersOfArrEvenDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,6766,6787};
    
        System.out.println(findNumbers(new int[]{12,345,6766,6787}));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (evenDigit(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean evenDigit(int num) {
        int numberOfDigits = digit(num);

        return numberOfDigits % 2 == 0;
    }

    static int digit(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

}
