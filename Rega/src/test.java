import buissnesObjects.Adresse;
import buissnesObjects.Lagerhalle;
import buissnesObjects.LagerhalleNichtVorhandenException;
import buissnesObjects.LagerhalleVorhandenException;
import dao.LagerhalleDao;

public class test {
    public static void main(String[] args) {
        Adresse adresse = new Adresse("Lagerweg", "2", "Lagerhausen", "28279");
        Lagerhalle lagerhalle = new Lagerhalle("CoolesLager", adresse, "1");
        LagerhalleDao lagerhalleDao = new LagerhalleDao();


        try {
            lagerhalleDao.insert(lagerhalle);
            lagerhalleDao.insert(lagerhalle);
        } catch (
                LagerhalleVorhandenException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(lagerhalleDao.findAll());
        try {
            lagerhalle.setName("Neuer Name");
            lagerhalleDao.update(lagerhalle);
        } catch (
                LagerhalleNichtVorhandenException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(lagerhalleDao.findById(lagerhalle.getLagerNr()));
        } catch (LagerhalleNichtVorhandenException e) {
            System.out.println(e.getMessage());
        }
        try {
            lagerhalleDao.remove(lagerhalle);
        } catch (LagerhalleNichtVorhandenException e) {
            System.out.println(e.getMessage());
        }
        try {
            lagerhalleDao.remove(lagerhalle);

        } catch (LagerhalleNichtVorhandenException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(lagerhalleDao.findAll());
    }
}
