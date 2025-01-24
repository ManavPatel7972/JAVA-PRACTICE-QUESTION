public class SpiralMatrixPrint {
    public static void printSpiral(int arr[][]) {

        int startRow = 0;
        int endRow = arr.length - 1;
        int startCol = 0;
        int endCol = arr[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // top left to right
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }

            // right up to down
            for (int i = startRow + 1; i <= endRow; i++) {
                System.err.print(arr[i][endCol] + " ");

                if (startCol == endCol) {
                    break;
                }
            }

            // down right to left
            for (int j = endCol - 1; j >= startCol; j--) {
                System.out.print(arr[endRow][j] + " ");

                if (startRow == endRow) {
                    break;
                }
            }

            // left down to up
            for (int i = endRow - 1; i > startRow; i--) {
                System.out.print(arr[i][startCol] + " ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;

        }
    }

    public static void main(String agrs[]) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        printSpiral(arr);
    }
}
