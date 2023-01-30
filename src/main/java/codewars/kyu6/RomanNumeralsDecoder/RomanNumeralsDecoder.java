package codewars.kyu6.RomanNumeralsDecoder;

import java.util.Map;

public class RomanNumeralsDecoder {

    public static int solution(String roman) {

        Map<Character,Integer> romanNums = Map.of(
                'I',1,
                'V',5,
                'X',10,
                'L',50,
                'C',100,
                'D',500,
                'M',1000
        );
        int result = 0;

        for (int i = 0; i < roman.length(); i++) {
            result += romanNums.get(roman.charAt(i));
        }
        return result;
    }

}

