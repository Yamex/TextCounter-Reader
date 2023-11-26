package yama;
public class TextReader {
    public TextReader() {

    }

    public int getLetterCount() {
        return letterCount;
    }

    public int getWordCount() {
        return wordCount;
    }

    private int letterCount = 0;
    private int wordCount = 0;



    public boolean read(String input) {

        if(input.equals("stop")) {
            return true;
        }


        letterCount += input.length();
        wordCount++;
        return false;

    }
}