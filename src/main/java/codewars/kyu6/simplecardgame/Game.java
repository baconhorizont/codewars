package codewars.kyu6.simplecardgame;

public class Game {

    private static final String CARD_LETTERS = "TJQKA";
    private int stevePoints;
    private int joshPoints;
    public String winner(String[] deckSteve, String[] deckJosh) {

        for (int i = 0; i < deckSteve.length && i < deckJosh.length; i++){
           boolean steveActualIsDigit = isDigit(deckSteve[i]);
           boolean joshActualIsDigit = isDigit(deckJosh[i]);

            if (steveActualIsDigit && joshActualIsDigit){
                addPoint(Integer.parseInt(deckSteve[i]) > Integer.parseInt(deckJosh[i]), Integer.parseInt(deckSteve[i]) < Integer.parseInt(deckJosh[i]));
            }
            else if(!steveActualIsDigit && !joshActualIsDigit){
                addPoint(CARD_LETTERS.indexOf(deckSteve[i]) > CARD_LETTERS.indexOf(deckJosh[i]), CARD_LETTERS.indexOf(deckSteve[i]) < CARD_LETTERS.indexOf(deckJosh[i]));
            } else {
            addPoint(!steveActualIsDigit && joshActualIsDigit, steveActualIsDigit && !joshActualIsDigit);
            }
        }


        if (stevePoints == joshPoints){
            return "Tie";
        } else {
        return  stevePoints > joshPoints ? String.format("%s wins %d to %d","Steve",stevePoints,joshPoints) : String.format("%s wins %d to %d","Josh",joshPoints,stevePoints);
        }
    }




    private void addPoint(boolean deckSteve, boolean deckJosh) {
        if (deckSteve){
            stevePoints++;
        } else if (deckJosh) {
            joshPoints++;
            }
    }


    private boolean isDigit(String s){
        return Character.isDigit(s.charAt(0));
    }

    public void setStevePoints(int stevePoints) {
        this.stevePoints = stevePoints;
    }

    public void setJoshPoints(int joshPoints) {
        this.joshPoints = joshPoints;
    }
}
