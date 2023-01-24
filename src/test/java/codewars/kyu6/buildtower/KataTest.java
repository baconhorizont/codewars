package codewars.kyu6.buildtower;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @Test
    public void basicTests() {
        assertEquals(String.join(",", "*"), String.join(",", Kata.towerBuilder(1)));
        assertEquals(String.join(",", " * ", "***"), String.join(",", Kata.towerBuilder(2)));
        assertEquals(String.join(",", "  *  ", " *** ", "*****"), String.join(",", Kata.towerBuilder(3)));
    }

}