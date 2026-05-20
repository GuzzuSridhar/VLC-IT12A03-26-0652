package arrays;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] nums = { 10, 20, 40, 30 };
        int[] num = { 10, 20, 40, 30 };

        // length property
        System.out.println("The array has " + nums.length + "elements");

        // sort
        Arrays.sort(nums);
        System.out.println("Sorted Array " + Arrays.toString(nums));

        // equals
        Arrays.sort(num);
        System.out.println(Arrays.equals(nums, num));

        // fill
        int[] test = new int[3];
        Arrays.fill(test, 4);
        System.out.println(Arrays.toString(test));

        // copyOf
        int[] temp = Arrays.copyOf(test, 5);
        System.out.println(Arrays.toString(temp));

        // binarySearch
        int idx = Arrays.binarySearch(nums, 30);
        System.out.println(idx);
    }
}
