package codewars.kyu6.MexicanWave;

public class MexicanWave {

    public static String[] wave(String str) {
        String[] result = new String[str.replace(" ","").length()];
        int wavePosition = 0;
        for (int i = 0; i < result.length; i++) {
                char[] temp = str.toCharArray();
            while(temp[wavePosition] == ' ') {
                wavePosition++;
            }
            temp[wavePosition] = Character.toUpperCase(temp[wavePosition]);
            result[i] = new String(temp);
            wavePosition++;
        }
        return result;
    }
}
