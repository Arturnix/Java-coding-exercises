package pl.ArturZgodka.Exercises;

public class checkForUniqueChars {

    public static boolean isUniqueChars(String wordToCheck) {

        if(wordToCheck.length() > 128) {
            return false;
        }

        boolean[] char_set = new boolean[128];
        for(int i = 0; i < wordToCheck.length(); i++) {
            int val = wordToCheck.charAt(i);
            if(char_set[val]) {
                return false;
            } else {
                char_set[val] = true;
            }
        }
        return true;
    }
}