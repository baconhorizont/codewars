package codewars.kyu6.WriteNumberinExpandedForm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WriteNumberinExpandedFormTest {
    @Test
    public void testSomething() {
        assertEquals("10 + 2", WriteNumberinExpandedForm.expandedForm(12));
        assertEquals("40 + 2", WriteNumberinExpandedForm.expandedForm(42));
        assertEquals("70000 + 300 + 4", WriteNumberinExpandedForm.expandedForm(70304));
    }
}