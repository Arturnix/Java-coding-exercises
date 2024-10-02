package pl.JavaCodingExercises.Exercises;

import static java.lang.Math.abs;

public class OneEditAway {

    public static boolean checkIsStringOneOrZeroEditAway(String string1, String string2) {

        String shorterString;
        String longerString;
        //check if character was inserted, removed or replaced, or nothing was changed
        if(string1.equals(string2)) {
            return true;
        }
        if(abs(string1.length() - string2.length()) > 1) {
            return false;
        }

        if(string1.length() - string2.length() == -1) {
            shorterString = string1;
            longerString = string2;
            return compareStringsForAddOrRemoveEdit(shorterString, longerString);
        } else if (string1.length() - string2.length() == 1) {
            shorterString = string2;
            longerString = string1;
            return compareStringsForAddOrRemoveEdit(shorterString, longerString);
        } else if (string1.length() - string2.length() == 0) {
            return compareStringsForReplacementEdit(string1, string2);
        }
        return true;
    }

    private static boolean compareStringsForAddOrRemoveEdit(String shorterString, String longerString) {
        for(int i = 0; i < shorterString.length(); i++) {
            if(shorterString.charAt(i) != longerString.charAt(i) && shorterString.charAt(i) != longerString.charAt(++i)) {
                return false;
            }
        }
        return true;
    }

    private static boolean compareStringsForReplacementEdit(String string1, String string2) {
        int difference = 0;
        for(int i = 0; i < string1.length(); i++) {
            if(string1.charAt(i) != string2.charAt(i)) {
                difference++;
                if(difference > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
