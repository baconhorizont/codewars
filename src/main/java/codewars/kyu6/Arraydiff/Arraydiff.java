package codewars.kyu6.Arraydiff;

import java.util.ArrayList;
import java.util.List;

public class Arraydiff {

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> aAsList = toList(a);
        List<Integer> bAsList = toList(b);

        aAsList.removeAll(bAsList);

        return toArray(aAsList);
    }

    private static List<Integer> toList(int[] n){
        List<Integer> result = new ArrayList<>();
        for (int i: n) {
            result.add(i);
        }
        return result;
    }

    private static int[] toArray(List<Integer> n){
        int[] result = new int[n.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = n.get(i);
        }
        return result;
    }
    public int sum(List<?> mixed) {
        int counter = 0;

        for(Object actual: mixed){
            if (actual instanceof Number){
                counter += (Integer) actual;
            } else {
                counter += Integer.parseInt((String) actual);
            }
        }

        return counter;
    }
}
