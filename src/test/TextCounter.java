package test;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TextCounter {

    @Test
    void testCountCharacters() {
        TextCounter textCounter = new TextCounter();
        String inputText = "Hello, World!";
        int result = textCounter.countCharacters(inputText);
        assertEquals(13, result, "Antal tecken ska vara 13");
    }

    private int countCharacters(String inputText) {
        return 0;
    }

    @Test
    void testCountWords() {
        TextCounter textCounter = new TextCounter();
        String inputText = "This is a sample sentence.";
        int result = textCounter.countWords(inputText);
        assertEquals(5, result, "Antal ord ska vara 5");
    }

    private int countWords(String inputText) {
        return 0;
    }
}

