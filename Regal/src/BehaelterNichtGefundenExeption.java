public class BehaelterNichtGefundenExeption extends Exception{

    private String behaelterNr;

    BehaelterNichtGefundenExeption(String behaelterNr){
        this.behaelterNr = behaelterNr;
    }
    public String getBehaelterNr() {
        return behaelterNr;
    }
    public String getMessage(){
    return "Es ist kein Behälter mit der Behälternummer" + behaelterNr + "vorhanden";
    }

}
