package ooad.parola.classes;

public class Data {
    public Quiz getQuiz() {
        Vraag[] vragen = new Vraag[8];
        Alternatief[] alternatieven = {
            new Alternatief("Bayda", false), 
            new Alternatief("Benhazi", false),
            new Alternatief("Misrata", false),
            new Alternatief("Tripoli", true)
        };
        vragen[0] = new Meerkeuze("Wat is de hoofdstad van Libie?", 'T', alternatieven);

        Alternatief[] alternatieven1 = {
            new Alternatief("Davis Cup", true),
            new Alternatief("Diamond cup", false),
            new Alternatief("Misrata", false),
            new Alternatief("Nations League", false)
        };
        vragen[1] = new Meerkeuze("Wat is het officeuze landenkampioenschap tennis voor mannen", 'D', alternatieven1);

        Alternatief[] alternatieven2 = {
            new Alternatief("Henning Mankell", false),
            new Alternatief("Jo Nesbo", false),
            new Alternatief("Lars Kepler", false),
            new Alternatief("Stieg Larsson", true)
        };
        vragen[2] = new Meerkeuze("Hoe heet de schrijver van de Millenium-trilogie, een reeks misdaadromans? Het eerste boek uit de reeks heet 'Mannen die vrouwen haten'", 'L', alternatieven2);

        Alternatief[] alternatiefs3 = {
            new Alternatief("Arsenal", false),
            new Alternatief("Chelsea", false),
            new Alternatief("Everton", true),
            new Alternatief("Tottenham hotspurs", false)
        };
        vragen[3] = new Meerkeuze("Welke van de volgende engelse voetbalclubs komt uit Liverpool", 'E', alternatiefs3);

        JuisteKorteAntwoord[] juisteKorteAntwoorden = {
            new JuisteKorteAntwoord("California"),
            new JuisteKorteAntwoord("Colifornie")
        };
        vragen[4] = new KortAntwoord("In welke staat van de VS ligt de stad Los Angeles", 'C', juisteKorteAntwoorden);

        JuisteKorteAntwoord[] juisteKorteAntwoorden1 = {
            new JuisteKorteAntwoord("Eminemn"),
            new JuisteKorteAntwoord("slim shady")
        };
        vragen[5] = new KortAntwoord("Wat is de artiestennaam van de rapper Marshall Bruce Mathers |||", 'E', juisteKorteAntwoorden1);

        JuisteKorteAntwoord[] juisteKorteAntwoorden2 = {
            new JuisteKorteAntwoord("Adri"),
            new JuisteKorteAntwoord("Adrie")
        };
        vragen[6] = new KortAntwoord("Mathieu van der poel en zijn vader, die ook een wielrenner was, hebben allebei de gele trui gedragen in de tour de france. Wat is de voornaam van de vader van Mathieu?", 'A', juisteKorteAntwoorden2);

        JuisteKorteAntwoord[] juisteKorteAntwoords3 = {
            new JuisteKorteAntwoord("Imker"),
            new JuisteKorteAntwoord("Bijker")
        };
        vragen[7] = new KortAntwoord("Hoe noem je een persoon die zich bezighoudt met bijenteelt?", 'I', juisteKorteAntwoorden2);

        return new Quiz(vragen);
    }
}