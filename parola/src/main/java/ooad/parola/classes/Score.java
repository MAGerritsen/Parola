package ooad.parola.classes;

public class Score {
    private String woord;
    private int juisteAntwoorden;
    private int tijd;
    private int score;

    public Score(String woord, int juisteAntwoorden, int tijd) {
        this.woord = woord;
        this.juisteAntwoorden = juisteAntwoorden;
        this.tijd = tijd;
        this.score = score;

    }

    public int berekenScore() {
        PuntentellingAdapter puntentelling = new SimpeleBerekening();
        return puntentelling.berekenScore(woord, juisteAntwoorden, tijd);
    }
}
