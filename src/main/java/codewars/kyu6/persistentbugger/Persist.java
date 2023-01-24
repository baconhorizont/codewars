package codewars.kyu6.persistentbugger;

public class Persist {
    public static int persistence(long n) {
        if (n <= 10){
            return 0;
        }
        int counter = 0;
        while (n > 9){
            long result = 1;
            String temp = Long.toString(n);
            for (int i = 0; i < temp.length(); i++) {
                result *= Integer.parseInt(Character.toString(temp.charAt(i)));
            }
            n = result;
            counter++;
        }
        return counter;
    }
}
