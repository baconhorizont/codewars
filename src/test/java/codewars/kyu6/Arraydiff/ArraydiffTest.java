package codewars.kyu6.Arraydiff;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraydiffTest {


    @Test
    public void sampleTests() {
        assertArrayEquals(new int[] {2}, Arraydiff.arrayDiff(new int [] {1,2}, new int[] {1}));
        assertArrayEquals(new int[] {2,2}, Arraydiff.arrayDiff(new int [] {1,2,2}, new int[] {1}));
        assertArrayEquals(new int[] {1}, Arraydiff.arrayDiff(new int [] {1,2,2}, new int[] {2}));
        assertArrayEquals(new int[] {1,2,2}, Arraydiff.arrayDiff(new int [] {1,2,2}, new int[] {}));
        assertArrayEquals(new int[] {}, Arraydiff.arrayDiff(new int [] {}, new int[] {1,2}));
    }

}