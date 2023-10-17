package ooad.parola.classes;

public class Meerkeuze extends Vraag {

    private Alternatief[] alternatieven;

    public Meerkeuze(String vraag, char letter, Alternatief[] alternatieven) {
        super(vraag, letter);
        
        this.alternatieven = alternatieven;
    }

    @Override
    public boolean controleerAntwoord(Antwoord antwoord) {
        // TODO Auto-generated method stub
        for (Alternatief alternatief : alternatieven) {
            if (alternatief.getAlternatief().equals(antwoord.getAntwoord())){
                return true;
            }
        }
        return false;
    }
}
