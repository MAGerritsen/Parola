package ooad.parola.classes;

import java.util.ArrayList;

public class Speler {
	private String gebruikersnaam;
	private String wachtwoord;
	private int saldo;

    // dit is voor het spelen van quiz, wanneer een quiz is afgelopen wordt dit allemaal op null gezet
    private Quiz quiz = null;
    private int huidigeVraag = 0;
    private Score score = null;
    private int juisteAntwoorden = 0;
    private char[] letters = new char[8];

    public Speler(String gebruikersnaam, String wachtwoord) {
        this.gebruikersnaam = gebruikersnaam;
        this.wachtwoord = wachtwoord;
        this.saldo = 1000;
    }

    public void geefAntwoord(String antwoord) {
        Antwoord gegevenAntwoord = new Antwoord(antwoord);
        System.out.println(antwoord);
        if (quiz.getVragen()[huidigeVraag - 1].controleerAntwoord(gegevenAntwoord)) {
            letters[juisteAntwoorden] = quiz.getVragen()[huidigeVraag - 1].getLetter();
            juisteAntwoorden++;
            System.out.println(juisteAntwoorden);
        }
        // return "";
    }

    public void speelQuiz() {
        System.out.println(huidigeVraag); // test code TODO: remove

        // get quiz
        if (huidigeVraag == 0) {
            quiz = new Data().getQuiz();
            score = new Score(wachtwoord, saldo, huidigeVraag);
        } 

        // toon vraag
        System.out.println(quiz.getVragen()[huidigeVraag]);
        huidigeVraag++;

        if (huidigeVraag == quiz.getVragen().length) {
            // bereken punten
            System.out.println("eind");

            for (int i = 0; i < juisteAntwoorden; i++) {
                System.out.print(letters[i]);
            }

            // sluit
        }
    }

    public void kopenCredits(int aantal, Speler speler) {
        // wordt niet geimplementeerd omdat het niet essentieel is voor het spelen van een quiz
    }
}
