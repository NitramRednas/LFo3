public class Panzer extends Munition implements Kampffahrzeuge, Ketten {

    private double kaliber;
    private String kennung;

    public Panzer(String vollmante, String HESH, String APFSDS, double kaliber, String kennung) {
        super(vollmante, HESH, APFSDS);
        this.kaliber = kaliber;
        this.kennung = kennung;
    }

    @Override
    public void bezeichnung() {
        System.out.println("Leopard 2A5");
    }

    @Override
    public void rolle() {
        System.out.println("Kampfpanzer");
    }

    @Override
    public void besatzung() {
        System.out.println("Kommandant, Ladeschütze, Richtschütze, Fahrer");
    }

    @Override
    public void Kettentyp() {
        System.out.println("Vollkette");
    }

    @Override
    public void Kettenbreite() {
        System.out.println("220mm");
    }

    @Override
    public void Kettenmaterial() {
        System.out.println("Stahl");
    }
}
