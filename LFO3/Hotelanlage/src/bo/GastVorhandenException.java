package bo;

public class GastVorhandenException extends Exception {
    private int gastNr;

    public GastVorhandenException(int gastNr) {
        this.gastNr = gastNr;
    }

    @Override
    public String getMessage() {
        return "der Gast mit der Nr: " + gastNr + " ist schon vorhanden";
    }
}
