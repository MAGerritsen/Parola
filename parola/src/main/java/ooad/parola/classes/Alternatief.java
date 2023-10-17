package ooad.parola.classes;

public class Alternatief implements Meerkeuze {
    private String alternatief;
    private boolean Isjuist;

    public Alternatief(String alternatief, boolean Isjuist) {
        this.alternatief = alternatief;
        this.Isjuist = Isjuist;
    }

    public boolean controleerAntwoord(String antwoord) {
        return this.alternatief.equals(antwoord);
    }
}