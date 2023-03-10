package codewars.kyu5.DirectionsReduction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirReductionTest {
    @Test
    public void testSimpleDirReduc() {

        assertArrayEquals(new String[]{"WEST"}, DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));

        assertArrayEquals(new String[]{}, DirReduction.dirReduc(new String[]{"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"}));

        assertArrayEquals(new String[]{"WEST","WEST"}, DirReduction.dirReduc(new String[]{"NORTH", "EAST", "WEST", "SOUTH", "WEST", "WEST"}));
    }
}



