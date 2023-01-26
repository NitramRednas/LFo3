public class Tonne extends Behaelter {

    private double durchmesser;


    Tonne(String behaelterNr, double gewichtBehaelter, double gewichtbehaelterMax, double hoehe, double durchmesser){
        super(behaelterNr, gewichtBehaelter, gewichtbehaelterMax, hoehe);
        this.durchmesser = durchmesser;
    }

    public double getDurchmesser() {
        return durchmesser;
    }

    public void setDurchmesser(double durchmesser) {
        this.durchmesser = durchmesser;
    }

    @Override
    public String toString() {
        return "Tonne{" +
                "durchmesser=" + durchmesser +
                '}';
    }
}
