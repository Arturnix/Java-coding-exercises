package pl.JavaCodingExercises.exercises.arrays;

import java.util.Arrays;

public class URLify {

    //not in-place approach
    public static void URLifyString(char[] str) { //use char array to perform operations in-place.

        int spacesCount = 0;
        for (char c : str) { //first scan of provided str to count spaces
            if (c == ' ') {
                spacesCount++;
            }
        }

        char[] URL = new char[str.length + (spacesCount*2)];
        int index = 0;
        for(char c : str) { //seconds scan to replace ' ' with %20
            if(c != ' ') {
                URL[index] = c;
                ++index;
            } else {
                URL[index] = '%';
                URL[++index] = '2';
                URL[++index] = '0';
                ++index;
            }
        }

        /*We have implemented this problem using character arrays, because Java strings are immutable, if we used
        strings directly, the function would have to return a new copy of the string, but it woufd allow us to implement
        this in just one pass.*/

        System.out.println(Arrays.toString(URL));
    }
/* ---------------------------------------------- */
    //in-place approach
    //if string has spaces, row of spaces, at the end they are not counted in trueLength parameter. So string's trueLength is length from the beginning and to the las char before ending spaces.

    String string = "abcf fgre  "; //trueLength is 9 - only string meaning characters, no extra spaces for %20 included.
    char[] str = string.toCharArray();
    public static void URLifyString(char[] str, int trueLength) {

        int spacesCount = 0;
        for(int i = 0; i < trueLength; i++) {
            if(str[i] == ' ') {
                spacesCount++;
            }
        }

        int index = trueLength + (spacesCount * 2) - 1;

        for (int i = trueLength - 1; i >= 0; i--) {
            if (str[i] != ' ') {
                str[index] = str[i];
                index--;
            } else {
                str[index] = '0';
                str[--index] = '2';
                str[--index] = '%';
                --index;
            }
        }
        System.out.println(str);
    }

    //Time complexity O(n) - iterating through every element in array.
    //Space complexity O(1) - operations are being done in-place, on the same object which is provided as an argument.
}
