public class Gast extends Person{

    private Adresse adresse;
    private final int GastNr;

    public Gast(int GastNr, String vorname, String nachname, Adresse adresse, Adresse adresse1, int gastNr){
        super(vorname, nachname);
        this.adresse = adresse1;
        this.GastNr = gastNr;
    }

    public Adresse getAdresse(){
        return adresse;
    }

    public int getGastNr() {
        return GastNr;
    }
}
