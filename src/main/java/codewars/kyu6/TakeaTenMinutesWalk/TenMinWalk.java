package codewars.kyu6.TakeaTenMinutesWalk;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10){
            return false;
        }
        int n = 0;
        int s = 0;
        int e = 0;
        int w = 0;
        for (char c: walk) {
            switch (c){
                case 'n' : n++;
                break;
                case 's' : s++;
                break;
                case 'e' : e++;
                break;
                case 'w' : w++;
                break;
            }
        }
        return n-s == 0 && e-w == 0;
    }
}
