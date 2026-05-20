package arrays;

public class MultiDimensional {
    public static void main(String[] args) {
        // 2 dimensional array
        // rows and columns
        // syntax -> int[][]

        // creaing a 2d array
        int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // access the elements
        System.out.println(nums[0][0]); // 1
        System.out.println(nums[1][2]); // 6

        System.out.println("------------------------");

        // using loops to print values of array
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                System.out.print(nums[row][col] + " ");
            }
            System.out.println();
        }
    }
}
