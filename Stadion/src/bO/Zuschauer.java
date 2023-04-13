package bO;

public class Zuschauer extends Person{
    private Adresse adresse;
    private String ausweisNr;
    private Gewaltbereitschaft gewaltbereitschaft;

    public Zuschauer(String name, int alter, String ausweisNr) {
        super(name, alter);
        this.ausweisNr = ausweisNr;
    }

    public Zuschauer(String name, int alter, String ausweisNr, Gewaltbereitschaft gewaltbereitschaft) {
        super(name, alter);
        this.ausweisNr = ausweisNr;
        this.gewaltbereitschaft = gewaltbereitschaft;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getAusweisNr() {
        return ausweisNr;
    }

    public void setAusweisNr(String ausweisNr) {
        this.ausweisNr = ausweisNr;
    }

    public Gewaltbereitschaft getGewaltbereitschaft() {
        return gewaltbereitschaft;
    }

    public void setGewaltbereitschaft(Gewaltbereitschaft gewaltbereitschaft) {
        this.gewaltbereitschaft = gewaltbereitschaft;
    }

    @Override
    public String toString() {
        return super.toString()+"{" +
                "adresse=" + adresse +
                ", ausweisNr='" + ausweisNr + '\'' +
                ", gewaltbereitschaft=" + gewaltbereitschaft +
                '}';
    }
}
