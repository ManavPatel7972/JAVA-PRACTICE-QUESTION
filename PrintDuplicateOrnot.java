/*
 * Given an integer array nums, return true if any value appears at least twice in 
the array, and return false if every element is distinct. 

 */

public class PrintDuplicateOrnot {

    public static int duplicate(int nums[]) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return 1;

                }
                break;

            }
        }
        return 0;

    }

    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 1 };
        duplicate(nums);

    }

}