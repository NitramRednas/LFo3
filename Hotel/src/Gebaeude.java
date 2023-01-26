import java.util.ArrayList;

public class Gebaeude {

    private String name;
    private ArrayList<Etage> etagenListe = new ArrayList<>();

    public Gebaeude(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Etage> getEtagenListe() {
        return etagenListe;
    }

    public int getAnzahlEtagen(){
        return etagenListe.size();
    }

    public int getAnzahlZimmer(){
        int anzahlZimmer = 0;
        for (Etage etage: etagenListe) {
            anzahlZimmer += etage.getAnzahlZimmer();
        }
        return anzahlZimmer;
    }

    public int getAnzahlzimmerFrei(){
        int anzahl = 0;
        for (Etage etage: getEtagenListe()) {
            anzahl += etage.getAnzahlZimmerFrei();
        }
        return anzahl;
    }

    public int getAnzahlGaeste(){
        int anzahl = 0;
        for (Etage etage : getEtagenListe() ){
            anzahl += etage.getAnzahlGaeste();
        }
        return anzahl;
    }
}
