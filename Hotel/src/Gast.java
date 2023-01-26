public class Gast extends Person{

    private String vorname;
    private String nachname;
    private Adresse adresse;

    public Gast(String vorname, String nachname, Adresse adresse){
        super(vorname, nachname);
    }

    public Adresse getAdresse(){
        return adresse;
    }

}
