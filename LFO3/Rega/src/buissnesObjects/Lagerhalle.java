package buissnesObjects;

public class Lagerhalle {
    private String name;
    private Adresse adresse;
    private String lagerNr;

    public Lagerhalle(String name, Adresse adresse, String lagerNr) {
        this.name = name;
        this.adresse = adresse;
        this.lagerNr = lagerNr;
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

    public String getLagerNr() {
        return lagerNr;
    }

    @Override
    public String toString() {
        return "buissnesObjects.Lagerhalle{" +
                "name='" + name + '\'' +
                ", adresse=" + adresse +
                '}';
    }
}
