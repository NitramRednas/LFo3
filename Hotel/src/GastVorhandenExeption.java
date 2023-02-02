public class GastVorhandenExeption extends Exception {

    @Override
    public String getMessage(){

        return "Gast schon vorhanden";
    }
}
