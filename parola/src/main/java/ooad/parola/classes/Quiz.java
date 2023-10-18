package ooad.parola.classes;

public class Quiz {
    private Vraag[] vragen;

    public Quiz(Vraag[] vragen) {
        this.vragen = vragen;
    }

    public Vraag[] getVragen() {
        return vragen;
    }

    public void setVragen(Vraag[] vragen) {
        this.vragen = vragen;
    }
}
