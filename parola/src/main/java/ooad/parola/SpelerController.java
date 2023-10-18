package ooad.parola;

import java.util.Scanner;
import ooad.parola.classes.*;

public class SpelerController {
    public static void main(String[] args) {
        System.out.println("hello world");
        
        Scanner input = new Scanner(System.in);
        System.out.println("vul hier uw gebruikersnaam in: ");
        String gebruikersnaam = input.nextLine();
        System.out.println("vul hier uw wachtwoord in: ");
        String wachtwoord = input.nextLine();
        Speler speler = new Speler(gebruikersnaam, wachtwoord);
        
        for (int i = 0; i < 7; i++) {
            speler.speelQuiz();

            speler.geefAntwoord(input.nextLine());
        }
        speler.speelQuiz();

        // for (int i = 0; i < 4; i++) {
        //     System.out.println(speler.getVraag(i));
        //     speler.beantwoordVraag(i, input.nextLine());
        // }

        // System.out.println("Je hebt " + speler.getPunten() + " punten behaald.");
    }
}