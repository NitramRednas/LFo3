package bo;

public class GastNichtVorhandenException extends Exception {
    private int gastNr;

    public GastNichtVorhandenException(int gastNr) {
        this.gastNr = gastNr;
    }

    @Override
    public String getMessage() {
        return "der Gast mit der Nr: " + gastNr + " ist nicht vorhanden";
    }
}
