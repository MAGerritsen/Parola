package ooad.parola.classes;

public class Alternatief {
    private String alternatief;
    private boolean Isjuist;
    
    public Alternatief(String alternatief) {
        this.alternatief = alternatief;
    }

    public String getAlternatief() {
        return alternatief;
    }

    public void setAlternatief(String alternatief) {
        this.alternatief = alternatief;
    }

    public boolean isIsjuist() {
        return Isjuist;
    }

    public void setIsjuist(boolean isjuist) {
        Isjuist = isjuist;
    }
}