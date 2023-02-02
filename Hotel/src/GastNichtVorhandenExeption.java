public class GastNichtVorhandenExeption extends Exception{

    @Override
    public String getMessage() {
        return "Gast ist nicht vorhanden";
    }
}
