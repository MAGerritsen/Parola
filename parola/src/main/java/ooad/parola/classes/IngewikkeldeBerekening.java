package ooad.parola.classes;

public class IngewikkeldeBerekening implements PuntentellingAdapter {
    public int berekenScore(String woord, int juisteAntwoorden, int tijd) {
        return (10 * juisteAntwoorden) / (tijd / 60);
    }
}
