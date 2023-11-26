package test;
import yama.TextReader;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TextReaderTest {

    @Test
    public void testStop() {
        var tr = new TextReader();

        assertTrue(tr.read("stop"));
        assertEquals(tr.getLetterCount(), 0);
        assertEquals(tr.getWordCount(), 0);
    }

    @Test
    public void testWords() {
        var tr = new TextReader();

        tr.read("träd");
        tr.read("nisse");
        tr.read("fackla");

        assertEquals(4+5+6, tr.getLetterCount());
        assertEquals(3, tr.getWordCount());
    }

    @Test
    public void testWords2() {
        var tr = new TextReader();

        tr.read("träd");
        tr.read("nisse fackla");


        assertEquals(4+5+6, tr.getLetterCount());
        assertEquals(3, tr.getWordCount());

    }

}


