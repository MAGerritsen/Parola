package ooad.parola.classes;

import java.util.ArrayList;

public class Speler {
	private String gebruikersnaam;
	private String wachtwoord;
	private int saldo;

    // dit is voor het spelen van quiz, wanneer een quiz is afgelopen wordt dit allemaal op null gezet
    private Quiz quiz = null;
    private int huidigeVraag = -1;
    private Score score = null;
    private int juisteAntwoorden = 0;
    private char[] letters = new char[8];

    public Speler(String gebruikersnaam, String wachtwoord) {
        this.gebruikersnaam = gebruikersnaam;
        this.wachtwoord = wachtwoord;
        this.saldo = 1000;
    }

    public void geefAntwoord(String antwoord) {
        if (huidigeVraag < quiz.getVragen().length){
        Antwoord gegevenAntwoord = new Antwoord(antwoord);
        // System.out.println(antwoord);
            if (quiz.getVragen()[huidigeVraag - 1].controleerAntwoord(gegevenAntwoord)) {
                letters[juisteAntwoorden] = quiz.getVragen()[huidigeVraag - 1].getLetter();
                // System.out.println(letters[juisteAntwoorden]);
                juisteAntwoorden++;
            }
        } else {
            score = new Score(antwoord, juisteAntwoorden, 100 /* dit is een magic number, heb geen zin een timer te implementeren */);
            System.out.println("je score is: " + score.berekenScore());
        }
        // return "";
    }

    public void speelQuiz() {
        // System.out.println("spelen quiz"); // test code TODO: remove

        // get quiz
        if (huidigeVraag == -1) {
            quiz = new Data().getQuiz();
            score = new Score(wachtwoord, saldo, huidigeVraag);
            huidigeVraag++;
        } else if (huidigeVraag == quiz.getVragen().length) {
            // bereken punten
            System.out.println("Maak een woord met de volgende letters: ");

            for (int i = 0; i < juisteAntwoorden; i++) {
                System.out.print(" - " + letters[i]);
            }

            System.out.println();

            // sluit
        } else {
            // System.out.println(huidigeVraag + " / " + quiz.getVragen().length);

        // toon vraag
            System.out.println(quiz.getVragen()[huidigeVraag]);
            huidigeVraag++;
        }
    }

    public void kopenCredits(int aantal, Speler speler) {
        // wordt niet geimplementeerd omdat het niet essentieel is voor het spelen van een quiz
    }
}
