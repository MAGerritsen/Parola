package ooad.parola.classes;

public class Speler {
	private String gebruikersnaam;
	private String wachtwoord;
	private int saldo;

    private Quiz quiz;
    private Score score;
    private Antwoord antwoord;

    public Speler(String gebruikersnaam, String wachtwoord) {
        this.gebruikersnaam = gebruikersnaam;
        this.wachtwoord = wachtwoord;
        this.saldo = 1000;
    }

    public String geefAntwoord() {
        //geefAntwoord
        return "";
    }

    public void speelQuiz() {
    }

    public void kopenCredits(int aantal, Speler speler) {
    }
}
