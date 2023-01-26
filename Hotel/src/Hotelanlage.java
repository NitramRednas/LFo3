import java.util.ArrayList;

public class Hotelanlage {

    private String name;
    private Adresse adresse;
    private ArrayList<Gebaeude> gebaeudeListe = new ArrayList<>();

    public Hotelanlage(String name, Adresse adresse){
        this.name = name;
        this.adresse = adresse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public int getGebaeudeListe(){
        int anzahl = 0;
        for (Gebaeude gebaeude : gebaeudeListe()){
            anzahl += gebaeude.get
        }
    }

    public int getAnzahlZimmer(){

    }

    public int getAnzahlZimmerFrei(){

    }

    public int getAnzahlGaeste(){

    }
}
