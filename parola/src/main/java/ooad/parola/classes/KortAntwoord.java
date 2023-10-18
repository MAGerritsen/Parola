package ooad.parola.classes;

public class KortAntwoord extends Vraag {

    private JuisteKorteAntwoord[] antwoorden;

    public KortAntwoord(String vraag, char letter, JuisteKorteAntwoord[] antwoorden) {
        super(vraag, letter);
        
        this.antwoorden = antwoorden;
    }

    @Override
    public boolean controleerAntwoord(Antwoord antwoord) {
        for (JuisteKorteAntwoord juisteKorteAntwoord : antwoorden) {
            if (juisteKorteAntwoord.getAntwoord().equals(antwoord.getAntwoord())) {
                return true;
            }
        }
        return false;
    }
}
