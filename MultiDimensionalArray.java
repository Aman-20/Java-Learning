public class MultiDimensionalArray {
    public static void main(String[] args) {
        // 2D Array declaration and initialization
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Elements of 2D Array:");
        // Accessing array elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}