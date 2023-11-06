import java.util.Scanner;

public class WordLetterCounter {
    public static void main(String[] args) {

        int letterCount = 0;
        int wordCount = 0;


        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.println("Skriv ett ord eller 'stop':");

            String input = scanner.nextLine();

            if (input.equals("stop")) {
                break; //
            }

            letterCount += input.length();

            wordCount++;
        }

        scanner.close();

        System.out.println("Antal tecken: " + letterCount);
        System.out.println("Antal ord: " + wordCount);
    }
}