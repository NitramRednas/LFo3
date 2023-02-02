public class IFV extends Munition implements Kampffahrzeuge, Ketten {

    private int Infanterie;
    private boolean Kommandantenfahrzeug;

    public IFV(String vollmante, String HESH, String APFSDS, int infanterie, boolean kommandantenfahrzeug) {
        super(vollmante, HESH, APFSDS);
        this.Infanterie = infanterie;
        this.Kommandantenfahrzeug = kommandantenfahrzeug;
    }

    @Override
    public void bezeichnung() {
        System.out.println("Puma");
    }

    @Override
    public void rolle() {
        System.out.println("Unterstützung");
    }

    @Override
    public void besatzung() {
        System.out.println("Kommandant, Richtschütze, Fahrer");
    }

    @Override
    public void Kettentyp() {
        System.out.println("Volkette");
    }

    @Override
    public void Kettenbreite() {
        System.out.println("190mm");
    }

    @Override
    public void Kettenmaterial() {
        System.out.println("Stahl mit Gummipads");
    }
}
