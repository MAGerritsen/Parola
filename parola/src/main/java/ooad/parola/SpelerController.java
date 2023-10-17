package ooad.parola;

import java.util.Scanner;
import ooad.parola.classes.*;

public class SpelerController {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Speler speler = new Speler("Martijn", "wachtwoord");
        speler.speelQuiz();

        // for (int i = 0; i < 4; i++) {
        //     System.out.println(speler.getVraag(i));
        //     speler.beantwoordVraag(i, input.nextLine());
        // }

        // System.out.println("Je hebt " + speler.getPunten() + " punten behaald.");
    }
}