package ooad.parola.classes;

public abstract class Vraag {
    private String vraag;
    private char letter;

    public Vraag(String vraag, char letter) {
        this.vraag = vraag;
        this.letter = letter;
    }

    public boolean controleerAntwoord() {
        return true;
        //TODO: IMPLEMENTEREN
    }
}