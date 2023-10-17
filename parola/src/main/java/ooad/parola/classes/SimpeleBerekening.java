package ooad.parola.classes;

public class SimpeleBerekening implements PuntentellingAdapter {
    public int berekenScore(String woord, int juisteAntwoorden, int tijd) {
        int score = 0;
        if (juisteAntwoorden == 4) {
            score = 100;
        } else if (juisteAntwoorden == 3) {
            score = 50;
        } else if (juisteAntwoorden == 2) {
            score = 25;
        } else if (juisteAntwoorden == 1) {
            score = 10;
        } else {
            score = 0;
        }
        return score;
    }
}
