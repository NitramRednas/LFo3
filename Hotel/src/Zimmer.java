import java.util.ArrayList;

public class Zimmer {

    private int nr;
    private ArrayList<Gast> gastListe = new ArrayList<>();


    public Zimmer(int nr){
        this.nr = nr;
    }

    public int getNr() {
        return nr;
    }

    public ArrayList<Gast> getGastListe() {
        return gastListe;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public int getAnzahlGaeste(){
        int gaesteAnzahl = 0;
        for (Gast gast: gastListe) {
            for(int i = 0; i <= gastListe.size(); i++){
                gaesteAnzahl = gaesteAnzahl+1;
            }
        }
       return gaesteAnzahl;
    }
    public void checkIn(Gast gast){
        gastListe.add(gast);
    }
    public void checkOut(Gast gast){
        gastListe.remove(gast);
    }
}
