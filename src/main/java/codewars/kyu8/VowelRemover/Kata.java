package codewars.kyu8.VowelRemover;

import java.util.Arrays;
import java.util.List;


public class Kata {

    private static final String VOWELS = "aeiou";

    public static String shortcut(String input) {
        char[] chars = input.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : chars) {
            if (VOWELS.indexOf(c) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
