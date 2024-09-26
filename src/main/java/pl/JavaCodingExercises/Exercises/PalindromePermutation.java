package pl.JavaCodingExercises.Exercises;

import java.util.Arrays;

public class PalindromePermutation {

    public static boolean isPalindromePermutation(String string) {

        char[] stringAsArray = string.toCharArray();
        Arrays.sort(stringAsArray);

        int[] charOccurrences = new int[128]; //can be reduced to letters only
        int uniqueCharCount = 0;

       for(char c : stringAsArray) {
           if(c != ' ') {
               charOccurrences[c]++;
           }
       }

       for(int i : charOccurrences) {
           if (i % 2 != 0) {
               uniqueCharCount++;
               if (uniqueCharCount > 1) {
                   return false;
               }
           }
       }
        return true;
    }
}
