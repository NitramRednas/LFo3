import java.util.ArrayList;

public class Stadion {

    private String name;
    private Adresse adresse;
    private ArrayList<Block> blockListe;

    public Stadion(String name, Adresse adresse) {
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

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public ArrayList<Block> getBlockListe() {
        return blockListe;
    }

    @Override
    public String toString() {
        return "Stadion{" +
                "name='" + name + '\'' +
                ", adresse=" + adresse +
                ", blockListe=" + blockListe +
                '}';
    }
}
