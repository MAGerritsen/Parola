package ooad.parola.classes;

public class Speler {
	private String gebruikersnaam;
	private String wachtwoord;
	private int saldo;

    // private Quiz quiz;
    // private Score score;
    // private Antwoord antwoord;

    public Speler(String gebruikersnaam, String wachtwoord) {
        this.gebruikersnaam = gebruikersnaam;
        this.wachtwoord = wachtwoord;
        this.saldo = 1000;
    }

    public String geefAntwoord(String antwoord) {
        //geefAntwoord
        return "";
    }

    public void speelQuiz() {
        // get quiz
        System.out.println("Hallo " + this.gebruikersnaam);

        // speel quiz

        // bereken punten
    }

    public void kopenCredits(int aantal, Speler speler) {
        // wordt niet geimplementeerd omdat het niet essentieel is voor het spelen van een quiz
    }
}
