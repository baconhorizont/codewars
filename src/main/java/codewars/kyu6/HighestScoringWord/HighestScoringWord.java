package codewars.kyu6.HighestScoringWord;

public class HighestScoringWord {

    public static String high(String s) {
        String[] temp = s.split(" ");
        int actualTemp = 0;
        int actualMax = 0;
        String actualMaxWord = null;
        for (String actual: temp) {
            for (char c: actual.toCharArray()){
                actualTemp += Character.getNumericValue(c) - 9;
            }
                if(actualTemp > actualMax){
                    actualMax = actualTemp;
                    actualMaxWord = actual;
                }
                actualTemp = 0;
        }
        return actualMaxWord;
    }

}
