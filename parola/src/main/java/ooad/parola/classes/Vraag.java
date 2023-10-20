package ooad.parola.classes;

public abstract class Vraag {
    private String vraag;
    private char letter;

    public Vraag(String vraag, char letter) {
        this.vraag = vraag;
        this.letter = letter;
    }

    public abstract boolean controleerAntwoord(Antwoord antwoord);

    public String toString() {
        return this.vraag;
    }

    public String getVraag() {
        return vraag;
    }

    public char getLetter() {
        return letter;
    }
}
