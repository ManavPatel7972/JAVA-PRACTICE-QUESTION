public class MaxSubArrySum {
    public static void maxSubarrysum(int numbers[]) {
        int maxsum = Integer.MIN_VALUE; // -infinity
        int currentSum = 0;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
           
            for (int j = i; j < numbers.length; j++) {
               
                currentSum = 0;
                for (int k = i; k <= j; k++) {
                   //subarry sum;
                   currentSum = currentSum + numbers[k];
                }
                System.out.print( (count + 1)+" . SubArray Sum = " + currentSum);
                count++;
                if(maxsum < currentSum){
                    maxsum = currentSum;
                }

                System.out.println();
            }
            System.out.println();

        }
        System.out.println("max sum of subarry is = " + maxsum);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 }; //example = {1,-2,6,-1,3};
        maxSubarrysum(numbers);
    }

}
