package dao;

public class ZuschauerNichtVorhandenException extends Exception{
    private String ausweisNr;

    public ZuschauerNichtVorhandenException(String ausweisNr) {
        this.ausweisNr = ausweisNr;
    }

    @Override
    public String getMessage() {
        return "der Zuschauer mit der ausweisNr: " + ausweisNr + " ist nicht vorhanden";
    }
}
