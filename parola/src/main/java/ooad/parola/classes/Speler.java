package ooad.parola.classes;

public class Speler {
	private String gebruikersnaam;
	private String wachtwoord;
	private int saldo;

    // dit is voor het spelen van quiz, wanneer een quiz is afgelopen wordt dit allemaal op null gezet
    private Quiz quiz = null;
    private int huidigeVraag = 0;
    private Score score = null;
    private Antwoord antwoord = null;

    public Speler(String gebruikersnaam, String wachtwoord) {
        this.gebruikersnaam = gebruikersnaam;
        this.wachtwoord = wachtwoord;
        this.saldo = 1000;
    }

    public void geefAntwoord(String antwoord) {
        //geefAntwoord
        // return "";
    }

    public void speelQuiz() {
        // System.out.println("Hallo " + this.gebruikersnaam); // test code TODO: remove

        // get quiz
        if (huidigeVraag == 0) {
            quiz = new Data().getQuiz();
        } 

        // toon vraag
        System.out.println(quiz.getVragen()[huidigeVraag]);
        huidigeVraag++;

        if (huidigeVraag == quiz.getVragen().length) {
            // bereken punten
            System.out.println("eind");

            // sluit
        }
    }

    public void kopenCredits(int aantal, Speler speler) {
        // wordt niet geimplementeerd omdat het niet essentieel is voor het spelen van een quiz
    }
}
