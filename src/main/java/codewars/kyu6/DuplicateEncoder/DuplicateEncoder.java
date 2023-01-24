package codewars.kyu6.DuplicateEncoder;

import java.util.ArrayList;
import java.util.List;

public class DuplicateEncoder {

    static String encode(String word){
        String lowerCaseWord = word.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (countOccurs(lowerCaseWord,lowerCaseWord.charAt(i)) <= 1){
                sb.append("(");
            } else {
                sb.append(")");
            }
        }

        return sb.toString();
    }

    private static int countOccurs(String word,char c){
        return (int) word.chars()
                    .filter(i ->i == c)
                    .count();
    }
}
