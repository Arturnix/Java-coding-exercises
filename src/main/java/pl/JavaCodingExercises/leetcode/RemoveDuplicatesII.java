package pl.JavaCodingExercises.leetcode;

public class RemoveDuplicatesII {

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int occurence = 0;

       for(int num : nums) {
           if(i == 0) {
               nums[i++] = num;
               occurence++;
                continue;
           }
           if(num > nums[i - 1]) {
               occurence = 0;
               nums[i++] = num;
           }
           if (num == nums[i-1]) {
               occurence++;
               if(occurence == 2) {
                   nums[i++] = num;

               }
           }
       }

       for(int num : nums) {
           System.out.println(num);
       }
        System.out.println(i);

        return i;
    }
}

