package codewars.kyu6.Countthesmileyfaces;

import java.util.List;

public class SmileFaces {

    private static final String VALID_EYE = ":;";
    private static final String VALID_NOSE = "-~";
    private static final String VALID_MOUTH = ")D";
    public static int countSmileys(List<String> arr) {
        int counter = 0;
        if (arr.isEmpty()){
            return counter;
        }
        for (String actual: arr) {
            if (actual.length() == 2 && VALID_EYE.indexOf(actual.charAt(0)) != -1 && VALID_MOUTH.indexOf(actual.charAt(1)) != -1){
                counter++;
            }
            if (actual.length() == 3 && VALID_EYE.indexOf(actual.charAt(0)) != -1 && VALID_NOSE.indexOf(actual.charAt(1)) != -1 && VALID_MOUTH.indexOf(actual.charAt(2)) != -1){
                counter++;
            }
        }
        return counter;
    }
}