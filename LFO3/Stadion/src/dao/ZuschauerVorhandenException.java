package dao;

public class ZuschauerVorhandenException extends Exception{
    private String ausweisNr;

    public ZuschauerVorhandenException(String ausweisNr) {
        this.ausweisNr = ausweisNr;
    }

    @Override
    public String getMessage() {
        return "der Zuschauer mit der ausweisNr: " + ausweisNr + " ist vorhanden";
    }
}
