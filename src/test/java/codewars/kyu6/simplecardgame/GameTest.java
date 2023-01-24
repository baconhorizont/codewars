package codewars.kyu6.simplecardgame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    private Game game = new Game();

    @Test
    public void testGame() {
        assertEquals("Steve wins 2 to 1", game.winner(new String[]{"A", "7", "8"}, new String[]{"K", "5", "9"}));
        game.setJoshPoints(0);
        game.setStevePoints(0);
        assertEquals("Josh wins 3 to 1", game.winner(new String[]{"3", "2", "8","6"}, new String[]{"6", "5", "9","2"}));
        game.setJoshPoints(0);
        game.setStevePoints(0);
        assertEquals("Steve wins 2 to 1", game.winner(new String[]{"T", "A", "8","6"}, new String[]{"6", "A", "K","2"}));
        game.setJoshPoints(0);
        game.setStevePoints(0);

        assertEquals("Tie", game.winner(new String[]{"3", "5", "9","2"}, new String[]{"3", "5", "9","2"}));
        game.setJoshPoints(0);
        game.setStevePoints(0);

        assertEquals("Tie", game.winner(new String[]{"T"}, new String[]{"T"}));
        game.setJoshPoints(0);
        game.setStevePoints(0);
    }
}