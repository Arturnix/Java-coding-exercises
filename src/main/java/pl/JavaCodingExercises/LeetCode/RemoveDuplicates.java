package pl.JavaCodingExercises.LeetCode;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {

       /* int sizeOfArrayWithoutDuplicates = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i-1] != nums[i]) {
                sizeOfArrayWithoutDuplicates++;
            }
        }

        int[] noDuplicates = new int[sizeOfArrayWithoutDuplicates];
        int indexNoDuplicates = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i == 0) {
                noDuplicates[indexNoDuplicates] = nums[i];
                indexNoDuplicates++;
            }
            if(i > 0) {
                if(nums[i] == nums[i-1]){
                    continue;
                } else {
                    noDuplicates[indexNoDuplicates] = nums[i];
                    indexNoDuplicates++;
                }
            }
        }

        for(int i = 0; i < noDuplicates.length; i++) {
            nums[i] = noDuplicates[i];
        }

        int k = noDuplicates.length;

        return k;*/

        int i = 0;

        for (final int num : nums)
            if (i < 1 || num > nums[i - 1])
                nums[i++] = num;


        return i;
    }
}
