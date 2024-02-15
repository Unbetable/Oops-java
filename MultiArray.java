public class MultiArray {

    public static void main(String[] args) {
        // Multidimensional array
        int[][] multiArray = {
                {2, 4, 6},
                {8, 10, 12},
                {14, 16, 18}
        };

        // Displaying elements of multidimensional array
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }

        // Finding the length of a single array
        int[] singleArray = {5, 10, 15, 20, 25};

        System.out.println("\nLength of Single Array: " + singleArray.length);
    }
}
