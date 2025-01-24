/*
 *  Given n non-negative integers representing an elevation map where the width 
of each bar is 1, compute how much water it can trap after raining.


height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1] 
Output:  6
 */

public class TrappedRainWater {
    public static int trappedwaterRain(int height[]) {
        int n = height.length;

        // lM=leftMax;
        int lM[] = new int[n];
        lM[0] = height[0];

        for (int i = 0; i < n; i++) {
            lM[i] = Math.max(height[i], lM[i - 1]);

        }

        // rM=rightMax;
        int rM[] = new int[n];
        rM[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i++) {
            rM[i] = Math.max(height[i], rM[i + 1]);

        }

        int trappingwater = 0;

        // loop

        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(lM[i], rM[i]);

            trappingwater += waterLevel - height[i];

        }
        return trappingwater;
    }

    public static void main(String args[]) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

        System.out.println("total trappedwater is = " + trappedwaterRain(height));
    }
}
