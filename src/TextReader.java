import java.util.Scanner;

public class TextReader {
    public static void main(String[] args) {
        TextCounter textCounter = new TextCounter(); // Skapa en instans av TextCounter-klassen
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv in rader (skriv 'stop' för att avsluta):");

        while (true) {
            String input = scanner.nextLine();

            // Kontrollera om användaren har skrivit "stop" i TextCounter-klassen
            if (textCounter.checkStop(input)) {
                break;
            }

            textCounter.updateCounts(input);
        }

        // Stäng Scanner
        scanner.close();

        // Skriv ut resultatet från TextCounter-klassen
        textCounter.printResults();
    }
}