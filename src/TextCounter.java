public class TextCounter {
    private int letterCount = 0;
    private int wordCount = 0;

    // Uppdatera räknare
    public void updateCounts(String input) {
        letterCount += input.length();
        wordCount++;
    }

    // Kontrollera om användaren har skrivit "stop"
    public boolean checkStop(String input) {
        return input.equalsIgnoreCase("stop");
    }

    // Skriv ut resultatet
    public void printResults() {
        System.out.println("Totalt antal bokstäver: " + letterCount);
        System.out.println("Totalt antal ord: " + wordCount);
    }
}