package codewars.kyu6.RomanNumeralsDecoder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsDecoderTest {

    @Test
    void testDecoder(){

        assertEquals(3,RomanNumeralsDecoder.solution("III"));
        assertEquals(1112,RomanNumeralsDecoder.solution("IIXMC"));
        assertEquals(550,RomanNumeralsDecoder.solution("LD"));

    }

}