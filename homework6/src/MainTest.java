import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void shouldFindSymbolOccurance() {
        var main = new Main();

        int result = main.findSymbolOccurance("aplpe", 'p');
        assertEquals(2, result);
    }

    @Test
    void shouldFindWordPosition() {
        var main = new Main();
        int result = main.findWordPosition("Apollo", "pollo");
        assertEquals(1, result);
    }

    @Test
    void shouldStringReverse() {
        var main = new Main();

        String result = main.stringReverse("Hello");
        assertEquals("olleH", result);
    }

    @Test
    void shouldIsPalindrome() {
        var main = new Main();

        boolean result1 = main.isPalindrome("ERE");
        boolean result2 = main.isPalindrome("Allo");
        assertTrue(result1);
        assertFalse(result2);
    }

    @Test
    void shouldTypeInWord() {
        String result = Main.typeInWord();
        String expected = "Test";
        assertEquals(expected, result);
    }

    @Test
    void shouldCheckIfCorrectWord() {
        boolean result1 = Main.checkIfCorrectWord("apple", "apricot");
        boolean result2 = Main.checkIfCorrectWord("apple", "apple");
        assertFalse(result1);
        assertTrue(result2);
    }
}