// Print SubArray;
// Array ka continues part ...

public class PrintSubArry {
    public static void pritnSubarry(int numbers[]) {
        int total_Subarry = 0;          // total subarry formula = (n(n+1))/2;
                                        // where n = size of arry;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " "); // print subArray;
                }
                total_Subarry++;
                System.out.println();
            }
            System.out.println();

        }

        System.out.println("total subarrys = " + total_Subarry);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        pritnSubarry(numbers);
    }

}
