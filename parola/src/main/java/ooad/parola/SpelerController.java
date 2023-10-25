package ooad.parola;

import java.util.Scanner;
import ooad.parola.classes.*;

public class SpelerController {

    public static Scanner input = new Scanner(System.in);
        
    public static void main(String[] args) {
        System.out.println("hello world");

        // Scanner input = new Scanner(System.in);
        
        System.out.println("vul hier uw gebruikersnaam in: ");
        String gebruikersnaam = input.nextLine();
        System.out.println("vul hier uw wachtwoord in: ");
        String wachtwoord = input.nextLine();
        Speler speler = new Speler(gebruikersnaam, wachtwoord);
        
        speelQuiz(speler);

    }

    public static void speelQuiz(Speler speler) {
        speler.speelQuiz();

        for (int i = 0; i < 9; i++) {
            speler.speelQuiz();

            geefAntwoord(speler);
        }
    }

    public static void geefAntwoord(Speler speler) {
        // Scanner input = new Scanner(System.in);

        speler.geefAntwoord(input.nextLine());
    }
}