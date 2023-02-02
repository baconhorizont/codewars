package codewars.kyu5.DirectionsReduction;

import java.util.*;

public class DirReduction {

    public static String[] dirReduc(String[] arr) {
        int shout = 0;
        int north = 0;
        int west = 0;
        int east = 0;
        List<String> result = new ArrayList<>();
        for (String actual: arr) {
            if(actual.equals("NORTH")){
                north++;
            }
            if(actual.equals("EAST")){
                east++;
            }
            if(actual.equals("WEST")){
                west++;
            }
            if(actual.equals("SOUTH")){
                shout++;
            }
        }

        if(north == shout && west == east){
            return new String[] {};
        }

        if(north > shout){
            addToResult(result,"NORTH",north - shout);
        } else if (shout > north){
            addToResult(result,"SOUTH",shout - north);
        }
        if(west > east){
            addToResult(result,"WEST",west - east);
        } else if (east > west){
            addToResult(result,"EAST",east - west);
        }
        return result.toArray(new String[0]);
    }
    private static void addToResult(List<String> result,String direction,int times){
        for (int i = 0; i < times; i++) {
            result.add(direction);
        }
    }

}



//        Map<String,Integer> counter = new HashMap<>(Map.of("NORTH", 0, "EAST", 0, "WEST", 0, "SOUTH", 0));
//        for (String actual: arr) {
//            counter.put(actual,counter.get(actual) +1);
//        }
//        if(counter.get("NORTH") == counter.get("SOUTH") && counter.get("WEST") == counter.get("EAST")){
//            return new String[] {};
//        }
//
//        if(counter.get("NORTH") > counter.get("SOUTH")){
//            addToResult(result,"NORTH",counter.get("SOUTH") - counter.get("NORTH"));
//        } else if (counter.get("SOUTH") > counter.get("NORTH")){
//            result.add("SOUTH");
//        }
//
//        if(counter.get("WEST") > counter.get("EAST")){
//            result.add("WEST");
//        } else if (counter.get("EAST") > counter.get("WEST")){
//            result.add("EAST");
//        }
