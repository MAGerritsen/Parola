package ooad.parola.classes;

public class Antwoord {
    private String antwoord;
    private boolean juist;

    public Antwoord(String antwoord, boolean juist) {
        this.antwoord = antwoord;
        this.juist = juist;
    }

    public boolean isJuist() {
        return juist;
    }

    public String getAntwoord() {
        return antwoord;
    }
}
