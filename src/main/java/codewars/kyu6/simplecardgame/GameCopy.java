package codewars.kyu6.simplecardgame;

public class GameCopy {


    private static final String CARD_LETTERS = "TJQKA";
    public String winner(String[] deckSteve, String[] deckJosh) {
            int stevePoints = 0;
            int joshPoints = 0;
        for (int i = 0; i < deckSteve.length && i < deckJosh.length; i++){
            boolean steveActualIsDigit = isDigit(deckSteve[i]);
            boolean joshActualIsDigit = isDigit(deckJosh[i]);

            if (steveActualIsDigit && joshActualIsDigit){
                if (Integer.parseInt(deckSteve[i]) > Integer.parseInt(deckJosh[i])){
                    stevePoints++;
                } else if (Integer.parseInt(deckSteve[i]) < Integer.parseInt(deckJosh[i])) {
                    joshPoints++;
                }
            }
            if (!steveActualIsDigit && !joshActualIsDigit){
                if (CARD_LETTERS.indexOf(deckSteve[i]) > CARD_LETTERS.indexOf(deckJosh[i])){
                    stevePoints++;
                } else if (CARD_LETTERS.indexOf(deckSteve[i]) < CARD_LETTERS.indexOf(deckJosh[i])){
                    joshPoints++;
                }
            }
            if (!steveActualIsDigit && joshActualIsDigit){
                stevePoints++;
            } else if (steveActualIsDigit && !joshActualIsDigit) {
                joshPoints++;
            }
        }
        if (stevePoints == joshPoints){
            return "Tie";
        } else {
            return  stevePoints > joshPoints ? String.format("%s wins %d to %d","Steve",stevePoints,joshPoints) : String.format("%s wins %d to %d","Josh",joshPoints,stevePoints);
        }
    }


    private boolean isDigit(String s){
        return Character.isDigit(s.charAt(0));
    }

}
