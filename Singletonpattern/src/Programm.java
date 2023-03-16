public class Programm {

    public static void main(String[] args) {
        OptionenSingleton.getInstance().setSpeicherort("Kartoffelacker");
        String speicherort = null;
        speicherort = OptionenSingleton.getInstance().getSpeicherort();
        System.out.println(speicherort);
    }

}
