package homework6;

import homework6.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest extends Main {

    @Test
    void shouldFindSymbolOccurance() {
        var main = new Main();

        int result = main.findSymbolOccurance("aplpe", 'p');
        Assertions.assertEquals(2, result);
    }

    @Test
    void shouldFindWordPosition() {
        var main = new Main();
        int result = main.findWordPosition("Apollo", "pollo");
        Assertions.assertEquals(1, result);
    }

    @Test
    void shouldStringReverse() {
        var main = new Main();

        String result = main.stringReverse("Hello");
        Assertions.assertEquals("olleH", result);
    }

    @Test
    void shouldIsPalindrome() {
        var main = new Main();

        boolean result1 = main.isPalindrome("ERE");
        boolean result2 = main.isPalindrome("Allo");
        Assertions.assertTrue(result1);
        Assertions.assertFalse(result2);
    }

//    @Test
//    void shouldTypeInWord() {
//        String result = Main.typeInWord();
//        String expected = "Test";
//        Assertions.assertEquals(expected, result);
//    }

    @Test
    void shouldCheckIfCorrectWord() {
        boolean result1 = Main.checkIfCorrectWord("apple", "apricot");
        boolean result2 = Main.checkIfCorrectWord("apple", "apple");
        Assertions.assertFalse(result1);
        Assertions.assertTrue(result2);
    }

    @Test
    void shouldHelpWithWord() {
        String result1 = Main.helpWithWord("puzzle", "pizza");
        Assertions.assertEquals("p#zz###########", result1);
    }
}