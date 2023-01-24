package codewars.kyu6.countingduplicates;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountingDuplicates {

    public static int duplicateCount(String text) {
        int counter = 0;
        String lowerCase = text.toLowerCase();
        char[] temp = lowerCase.toCharArray();
        List<Character> temp1 = new ArrayList<>();
        List<Character> temp2 = new ArrayList<>();
        for (int i = 0; i < temp.length; i++) {
                temp1.add(lowerCase.charAt(i));
                if(!temp2.contains(lowerCase.charAt(i))){
                    temp2.add(lowerCase.charAt(i));
                }
            }
        for (Character character : temp2) {
            if (Collections.frequency(temp1, character) > 1) {
                counter++;
            }
        }
        return counter;
        }
    }

