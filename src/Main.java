import yama.TextReader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var tr = new TextReader();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv in rader (skriv 'stop' för att avsluta):");

        while (true) {
            String input = scanner.nextLine();

            if(tr.read(input)) {

                break;
            }
        }

        // Stäng Scanner
        scanner.close();

        System.out.println("Totalt antal bokstäver: " + tr.getLetterCount());
        System.out.println("Totalt antal ord: " + tr.getWordCount());


    }
}