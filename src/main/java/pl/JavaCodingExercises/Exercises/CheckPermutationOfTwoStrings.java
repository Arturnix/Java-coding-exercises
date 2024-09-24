package pl.JavaCodingExercises.Exercises;

import java.util.Arrays;

public class CheckPermutationOfTwoStrings {

    public static boolean checkPermutation(String string1, String string2) {

        if(string1.length() != string2.length()) {
            return false;
        }

        if(string1.equals(string2)) {
            return true;
        }

        char[] string1AsArray = string1.toCharArray();
        char[] string2AsArray = string2.toCharArray();
        Arrays.sort(string1AsArray);
        Arrays.sort(string2AsArray);
        String string1Sorted = new String(string1AsArray);
        String string2Sorted = new String(string2AsArray);

        return string1Sorted.equals(string2Sorted);
    }
}
