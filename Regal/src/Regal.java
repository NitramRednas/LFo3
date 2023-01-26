import java.util.ArrayList;

public class Regal {

    private Lagerhalle lagerhalle;
    private ArrayList<Behaelter> behaelterListe;

    Regal(Lagerhalle lagerhalle){
        this.lagerhalle = lagerhalle;
    }

    public Lagerhalle getLagerhalle() {
        return lagerhalle;
    }

    public void addBehaelter(Behaelter behaelter){
        behaelterListe.add(behaelter);
    }
    public void removeBehaelter(Behaelter behaelter) throws BehaelterNichtGefundenExeption{
        behaelterListe.remove(behaelter);
    }
    public Behaelter getBehaelter(String behaelterNr) throws BehaelterNichtGefundenExeption{
        for(Behaelter behaelter : behaelterListe){
            if (behaelter.getBehaelerNr().equals(behaelterNr)){
                return behaelter;
            }
        }
        throw new BehaelterNichtGefundenExeption(behaelterNr);
    }
    public int getAnzahlBehaelter(){
        int anzahl = 0;
        for (Behaelter behaelter: behaelterListe) {
            anzahl++;
        }
        return anzahl;
    }
    public double getGewichtGesamt(){
        double gewicht = 0;
        for (Behaelter behaelter: behaelterListe) {
            gewicht += behaelter.getGewichtInhalt() + behaelter.getGeweichtBehaelter();
        }
        return gewicht;
    }

    @Override
    public String toString() {
        return "Regal{" +
                "lagerhalle=" + lagerhalle +
                ", behaelterListe=" + behaelterListe +
                '}';
    }
}
