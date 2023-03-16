package bO;

public class Block {
    private String name;
    private Sitzplatz[][] sitzplaetze;

    public Block(String name, int anzahlReihen, int anzahlSitze) {
        this.name = name;
        this.sitzplaetze = new Sitzplatz[anzahlReihen][anzahlSitze];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAnzahlReihen(){
        return sitzplaetze.length;
    }
    public int getAnzahlSitze(){
        return getAnzahlReihen() * sitzplaetze[0].length;
    }
    public int getAnzahlZuschauer(){
        int count = 0;
        for (int i = 0; i < getAnzahlReihen(); i++){
            for (Sitzplatz s : sitzplaetze[i]){
                if (s!= null){
                    count++;
                }
            }
        }
        return count;
    }
    public int getAnzahlZuschauer(Gewaltbereitschaft gewaltbereitschaft){
        int count = 0;
        for (int i = 0; i < getAnzahlReihen(); i++){
            for (Sitzplatz s : sitzplaetze[i]){
                if (s!= null && s.getZuschauer().getGewaltbereitschaft() == gewaltbereitschaft){
                    count++;
                }
            }
        }
        return count;
    }

    public boolean vergebenSitz(int reihe, int sitz, Zuschauer zuschauer) throws SitzplatzAngabeInvalideException {
        if (reihe <= getAnzahlReihen() && reihe >= 0){
            if (sitz <= sitzplaetze[0].length && sitz >= 0){
                if (sitzplaetze[reihe][sitz] == null){
                    sitzplaetze[reihe][sitz] = new Sitzplatz(reihe, sitz,this, zuschauer);
                    return true;
                }else{
                    return false;
                }
            }
        }
        throw new SitzplatzAngabeInvalideException(reihe, sitz);
    }
}
