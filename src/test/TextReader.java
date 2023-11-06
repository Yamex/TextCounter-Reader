package test;


import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class TextReader {

    @Test
    void testReadLinesUntilStop() {
        // Simulera användarinput
        String input = "Hello\nWorld\nstop\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Fånga upp programutmatningen
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Kör TextReader
        TextReader.main(new String[]{});

        // Kontrollera att programmet har avslutats
        assertTrue(outContent.toString().contains("Programmet har avslutats efter att användaren skrev 'stop'."));
    }

    private static void main(String[] strings) {

    }
}