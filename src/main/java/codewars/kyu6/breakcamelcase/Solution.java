package codewars.kyu6.breakcamelcase;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static String camelCase(String input) {

        List<Integer> indexes = new ArrayList<>(List.of(0));

        getUpperCaseIndexes(input, indexes);
        if (indexes.size() == 1){
            return input;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < indexes.size(); i++) {
            sb.append(input,indexes.get(i-1),indexes.get(i));
            sb.append(" ");
            if(i == indexes.size()-1){
                sb.append(input.substring(indexes.get(i)));
            }
        }

        return sb.toString();
    }

    private static void getUpperCaseIndexes(String input, List<Integer> indexes) {
        for (int i = 0; i < input.length(); i++) {
            if(Character.isUpperCase(input.charAt(i))){
                indexes.add(i);
            }
        }
    }

}
