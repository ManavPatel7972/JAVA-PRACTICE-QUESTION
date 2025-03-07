public class Pairs {
    public static void pairsPrint(int arr[]) {
        int totalpairs = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")" + " ");
                totalpairs++;
            }
            System.out.println();
        }
        System.out.println("total pairs = " +totalpairs);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 8, 10 };
        pairsPrint(arr);
    }
}
