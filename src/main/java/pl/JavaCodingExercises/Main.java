package pl.JavaCodingExercises;

import pl.JavaCodingExercises.Exercises.CheckPermutationOfTwoStrings;
import pl.JavaCodingExercises.Exercises.PalindromePermutation;
import pl.JavaCodingExercises.Exercises.URLify;
import pl.JavaCodingExercises.LeetCode.MajorityElement;

public class Main {
    public static void main(String[] args) {

        //System.out.println(isUniqeChars("abcc"));
        //RemoveElementsFromArray.removeElement(new int[]{3,2,2,3}, 3);
        //RemoveDuplicates.removeDuplicates(new int[]{0,0,1,1,2});
        //RemoveDuplicatesII.removeDuplicates(new int[]{1});
        //CheckPermutationOfTwoStrings.checkPermutation("12abc", "1ab2c");
        //System.out.println(CheckPermutationOfTwoStrings.checkPermutationWithCharsCount("aabc", "cbaa"));
        /*String string = "ab cffgre kl    ";
        char[] str = string.toCharArray();
        URLify.URLifyString(str, 12);*/
        //System.out.println(PalindromePermutation.isPalindromePermutation("t a c t coapapa"));
        System.out.println(MajorityElement.findMajorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}