public abstract class Munition {

    private String Vollmantel;
    private String HESH;
    private String APFSDS;

    public Munition(String vollmante, String HESH, String APFSDS) {
        Vollmantel = vollmante;
        this.HESH = HESH;
        this.APFSDS = APFSDS;
    }

    public String getVollmantel() {
        return Vollmantel;
    }

    public void setVollmantel(String vollmantel) {
        Vollmantel = vollmantel;
    }

    public String getHESH() {
        return HESH;
    }

    public void setHESH(String HESH) {
        this.HESH = HESH;
    }

    public String getAPFSDS() {
        return APFSDS;
    }

    public void setAPFSDS(String APFSDS) {
        this.APFSDS = APFSDS;
    }
}
