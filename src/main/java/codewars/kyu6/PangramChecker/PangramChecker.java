package codewars.kyu6.PangramChecker;

public class PangramChecker {

    private static final int ENGLISH_ALPHABET_LENGTH = 26;

    public boolean check(String sentence){
       return getDifferentCharsNumber(sentence) == ENGLISH_ALPHABET_LENGTH;
    }

    private long getDifferentCharsNumber(String temp){
        return temp.toLowerCase()
                .chars()
                .distinct()
                .filter(Character::isLetter)
                .count();
    }

}
