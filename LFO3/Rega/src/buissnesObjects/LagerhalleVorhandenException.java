package buissnesObjects;

public class LagerhalleVorhandenException extends Exception {
    private String lagerNr;

    public LagerhalleVorhandenException(String lagerNr) {
        this.lagerNr = lagerNr;
    }

    @Override
    public String getMessage() {
        return "der Lagerhalle mit der Nr: " + lagerNr + " ist vorhanden";
    }
}
