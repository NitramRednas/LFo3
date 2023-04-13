package bO;

public class SitzplatzAngabeInvalideException extends Exception{
    private int reihe;
    private int sitz;

    public SitzplatzAngabeInvalideException(int reihe, int sitz) {
        this.reihe = reihe;
        this.sitz = sitz;
    }

    public int getReihe() {
        return reihe;
    }

    public int getSitz() {
        return sitz;
    }

    @Override
    public String getMessage() {
        return "Die bO.Sitzplatz angaben für die reihe:"+ getReihe() +" mit dem sitz: "+ getSitz()+" sind nicht Valide";
    }
}
