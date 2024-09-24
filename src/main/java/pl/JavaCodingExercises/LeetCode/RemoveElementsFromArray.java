package pl.JavaCodingExercises.LeetCode;

import java.util.Arrays;

public class RemoveElementsFromArray {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        int[] nums2 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                k++;
                nums2[i] = nums[i];
            }
        }

        Arrays.sort(nums2);
        for (int i = 0; i < nums2.length; i++) {
            nums[i] = nums2[(nums2.length - 1) - i];
        }

        return k;
    }
}
