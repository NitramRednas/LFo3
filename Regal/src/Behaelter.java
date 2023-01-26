public abstract class Behaelter {

    private String behaelerNr;
    private double geweichtBehaelter;
    private double gewichtInhaltMax;
    private double gewichtInhalt;
    private double hoehe;

    Behaelter(String behaelerNr, double geweichtBehaelter, double gewichtInhaltMax, double hoehe){
        this.behaelerNr = behaelerNr;
        this.geweichtBehaelter = geweichtBehaelter;
        this.gewichtInhaltMax = gewichtInhaltMax;
        this.hoehe = hoehe;
    }

    public String getBehaelerNr() {
        return behaelerNr;
    }

    public double getGewichtInhalt() {
        return gewichtInhalt;
    }

    public void setGewichtInhalt(double gewichtInhalt) {
        this.gewichtInhalt = gewichtInhalt;
    }

    public double getGeweichtBehaelter() {
        return geweichtBehaelter;
    }

    public double getGewichtInhaltMax() {
        return gewichtInhaltMax;
    }

    public void setGewichtInhaltMax(double gewichtInhaltMax) {
        this.gewichtInhaltMax = gewichtInhaltMax;
    }

    public void setGeweichtBehaelter(double geweichtBehaelter) {
        this.geweichtBehaelter = geweichtBehaelter;
    }

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    @Override
    public String toString() {
        return "Behaelter{" +
                "behaelerNr='" + behaelerNr + '\'' +
                ", geweichtBehaelter=" + geweichtBehaelter +
                ", gewichtInhaltMax=" + gewichtInhaltMax +
                ", gewichtInhalt=" + gewichtInhalt +
                ", hoehe=" + hoehe +
                '}';
    }
}
