package pl.JavaCodingExercises.Exercises;

import java.util.Arrays;

public class CheckPermutationOfTwoStrings {

    public static boolean checkPermutation(String string1, String string2) {

        //If two strings are permutations, they have the same characters, but in different orders.
        //is the permutation comparison case sensitive?
        //is whitespace significant?

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
        //return sort(string1).equals(sort(string2));
    }

    public static boolean checkPermutationWithCharsCount(String string1, String string2) {

        if(string1.length() != string2.length()) {
            return false;
        }

        if(string1.equals(string2)) {
            return true;
        }

        int[] charsInString = new int[128]; //assumption of chars representation. Holds numbers of occurences of every char in string.
        //sprawdzam jakiego znaku jest ile powtórzeń danym stringu.

        char[] string1AsArray = string1.toCharArray();
        for(char c : string1AsArray) {
            charsInString[c]++;
        }

        for(int i = 0; i < string2.length(); i++) { //teraz sprawdzam dla tego tego drugiego podanego stringa. Na podstawie tego pierwszego odwzorowywałem tablicę wystąpień danego znaku.
            int c = string2.charAt(i);
            charsInString[c]--;
            if(charsInString[c] < 0) {
                return false;
            }
        }
        return true;
    }

    private static String sort(String string) {
        char[] stringAsArray = string.toCharArray();
        Arrays.sort(stringAsArray);

        return new String(stringAsArray);
    }
}
