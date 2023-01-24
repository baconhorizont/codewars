package codewars.kyu6.findtheoddint;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindOdd {
    public static int findIt(int[] a) {
        List<Integer> numbers = Arrays.stream(a).boxed().toList();
        for (Integer i : numbers) {
            if(Collections.frequency(numbers,i) %2 != 0){
            return i;
            }
        }
        return 0;
    }
}
