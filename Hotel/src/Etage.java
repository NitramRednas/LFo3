import java.util.ArrayList;

public class Etage {

    private String name;
    private ArrayList<Zimmer> zimmerListe = new ArrayList<>();
    private Zimmer zimmer;

    public Etage(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Zimmer> getZimmerListe() {
        return zimmerListe;
    }

    public int getAnzahlZimmer(){
        return zimmerListe.size();
    }
    public int getAnzahlZimmerFrei(){
         int zimmerFrei = 0;
        for (Zimmer zimmer : getZimmerListe()) {
            if (zimmerListe.isEmpty()) {
                zimmerFrei++;
            }
        }
        return zimmerFrei;
    }

    public int getAnzahlGaeste(){
        int anzahlgaeste = 0;
        for (Gast gast: zimmer.getGastListe()) {
            anzahlgaeste += zimmer.getAnzahlGaeste();
        }
        return anzahlgaeste;
    }

    @Override
    public String toString() {
        return "Etage{" +
                "name='" + name + '\'' +
                ", zimmerListe=" + zimmerListe +
                '}';
    }
}
