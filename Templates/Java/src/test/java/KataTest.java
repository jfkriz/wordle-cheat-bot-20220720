import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KataTest {
    private Kata fixture;

    @BeforeEach
    public void setUp() {
        String[] wordList = new String[]{"SHEET", "SHEEP", "KINKY", "SWEET", "MAUVE", "FLUNG", "SKEET"};
        fixture = new Kata(wordList);
    }

    @Test
    public void shouldBeAbleToConstructClass() {
        String name = "Ingage";
        assertNotNull(fixture);
    }

    @Test
    public void checkLastGuessShouldReturnNull() {
        assertNull(fixture.checkLastGuess("Ingage", "Sweet"));
    }

    @Test
    public void checkThatGuessIsCorrect() {
        String[] possibleWords = fixture.checkLastGuess("MAUVE", "GGGGG");
        assertNotNull(possibleWords);
        assertEquals(1, possibleWords.length);
        assertEquals("MAUVE", possibleWords[0]);
    }

    @Test
    public void lastLetterIsGray() {
        String[] possibleWords = fixture.checkLastGuess("SHEET", "GGGG-");
        assertNotNull(possibleWords);
        assertEquals(1, possibleWords.length);
        assertEquals("SHEEP", possibleWords[0]);
    }

    @Test
    public void lastLetterIsGray2() {
        String[] possibleWords = fixture.checkLastGuess("SHEEP", "GGGG-");
        assertNotNull(possibleWords);
        assertEquals(1, possibleWords.length);
        assertEquals("SHEET", possibleWords[0]);
    }

    @Test
    public void anyLetterIsGray() {
        String[] possibleWords = fixture.checkLastGuess("SLEET", "G-GGG");
        assertNotNull(possibleWords);
        assertEquals(3, possibleWords.length);
        assertEquals("SHEET", possibleWords[0]);
        assertEquals("SWEET", possibleWords[1]);
        assertEquals("SKEET", possibleWords[2]);
    }

    @Test
    public void twoLettersAreGray() {
        String[] possibleWords = fixture.checkLastGuess("SLEEP", "G-GG-");
        assertNotNull(possibleWords);
        assertEquals(3, possibleWords.length);
        assertEquals("SHEET", possibleWords[0]);
        assertEquals("SWEET", possibleWords[1]);
        assertEquals("SKEET", possibleWords[2]);
    }
}
