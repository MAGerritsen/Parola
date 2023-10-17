package ooad.parola.classes;

public class JuisteKorteAntwoord implements KortAntwoord {
    private String antwoord;

    public JuisteKorteAntwoord(String antwoord) {
        this.antwoord = antwoord;
    }

    public boolean controleerAntwoord(String antwoord) {
        return this.antwoord.equals(antwoord);
    }
}
