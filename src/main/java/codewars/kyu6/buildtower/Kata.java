package codewars.kyu6.buildtower;

public class Kata {

    public static String[] towerBuilder(int nFloors){
        String[] result = new String[nFloors];
        int starCounter = 1;
        int spaceCounter = nFloors - 1;

        for (int i = 0; i < nFloors; i++) {
            result[i] = " ".repeat(spaceCounter).concat("*".repeat(starCounter)).concat(" ".repeat(spaceCounter));
            starCounter += 2;
            spaceCounter --;
        }
        return result;
    }

}
