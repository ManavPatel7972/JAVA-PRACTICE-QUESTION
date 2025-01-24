package RECURSION_PROGRAM;

// Time Compexity O(n);

// public class RecursionPrintPower {
//     public static int printPower(int base, int expo) {

//         if (expo == 0) {
//             return 1;
//         }

//        return base * printPower(base,expo - 1);

//     }

//     public static void main(String args[]) {
//         int base = 2;
//         int expo = 10;

//         System.out.println("result = " + printPower(base, expo));
//     }
// }


// optimized code with Time Compexity O(logn);

public class RecursionPrintPower {
    public static int printPower(int base, int expo) {

        if (expo == 0) {
            return 1;

        }

        int halfPower = printPower(base, expo / 2);
        int halfPowerSq = halfPower * halfPower;

        // expo is odd;

        if (expo % 2 != 0) {
            halfPowerSq = base * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String args[]) {
        int base = 2;
        int expo = 5;

        System.out.println("result = " + printPower(base, expo));
    }
}
