package buissnesObjects;

public class LagerhalleNichtVorhandenException extends Exception {
    private String lagerNr;

    public LagerhalleNichtVorhandenException(String lagerNr) {
        this.lagerNr = lagerNr;
    }

    @Override
    public String getMessage() {
        return "der Lagerhalle mit der Nr: " + lagerNr + " ist nicht vorhanden";
    }
}
