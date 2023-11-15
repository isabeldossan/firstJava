package Isabel_Inlämningsuppgift;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyTestRunner {
    @Test
    public void testSpaceExcludedForCharCounter() {
        Logic logicCopy = new Logic();
        logicCopy.setMyWordArray("hejsan hej");
        logicCopy.setHowManyChars();
        int expected = 9;
        int actual = logicCopy.getHowManyChars();
        assertEquals(expected, actual);
    }

    @Test
    public void testLineCounterExcludesLastRow() {
        Logic logicCopy = new Logic();
        logicCopy.setHowManyLines(3);
        int expected = 2;
        int actual = logicCopy.getHowManyLines();
        assertEquals(expected, actual);
    }

    @Test
    public void testLongestWord() {
        Logic logicCopy = new Logic();
        logicCopy.setMyWordArray("jag heter faktiskt inte Hasse, jag heter Hasselicious!");
        logicCopy.setTheLongestWord();
        String expected = "Hasselicious!";
        String actual = logicCopy.getTheLongestWord();
        assertEquals(expected, actual);
    }

    @Test
    public void testWordCounter() {
        Logic logicCopy = new Logic();
        logicCopy.setMyWordArray("Vet inte alltid vad jag håller på med, men så kan det va.");
        logicCopy.setTotalAmountOfWords();
        int expected = 13;
        int actual = logicCopy.getTotalAmountOfWords();
        assertEquals(expected, actual);
    }
}