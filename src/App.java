import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int geheimzahl = random.nextInt(100) + 1; // Zahl von 1 bis 100
        int versuch = 0;
        int eingabe;

        System.out.println("Willkommen beim Zahlen-Raten-Spiel");
        System.out.println("Errate meine Zahl zwischen 1 und 100!");

        do {
            System.out.println("Gib eine Zahl ein: ");
            eingabe = scanner.nextInt();
            versuch++;

            if (eingabe < geheimzahl) {
                System.out.println("Zu niedrig!");
            } else if (eingabe > geheimzahl) {
                System.out.println("Zu hoch!");
            } else {
                System.out.println("Richtig! Du hast es in " + versuch + " Versuchen geschafft.");
            }
        } while (eingabe != geheimzahl);

        scanner.close();

    }
}
