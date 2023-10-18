package ooad.parola.classes;

public class Data {
    public Quiz getQuiz() {
        Vraag[] vragen = new Vraag[8];
        
        return new Quiz(vragen);
    }
}