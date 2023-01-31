package codewars.kyu5.DirectionsReduction;

import java.util.HashMap;
import java.util.Map;

public class DirReduction {

    public static String[] dirReduc(String[] arr) {
        Map<String,Integer> counter = new HashMap<>(Map.of("NORTH", 0, "EAST", 0, "WEST", 0, "SOUTH", 0));

        for (String actual: arr) {
            counter.put(actual,counter.get(actual) +1);
        }

        return new String[] {};
    }

}
