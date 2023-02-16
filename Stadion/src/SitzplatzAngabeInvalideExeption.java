public class SitzplatzAngabeInvalideExeption extends Exception{

    private int reihe;
    private int sitz;

    public void SitzplatzAngabeInvalideExeption() {
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
        return super.getMessage();
    }
}
