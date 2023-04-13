import bo.*;
import dao.gastDAO;

public class Main {
    public static void main(String[] args) {
        Adresse adresse = new Adresse("Schönhausen", "1", "28279", "Hampe");
        Gast olaf = new Gast("Olaf", "Scholz", adresse, 1);
        Gast max = new Gast("max", "Scholz", adresse, 2);
        Gast karl = new Gast("karl", "Scholz", adresse, 3);
        Gast erich = new Gast("erich", "Scholz", adresse, 4);

        Zimmer zimmer1 = new Zimmer(1);
        Zimmer zimmer2 = new Zimmer(2);
        Zimmer zimmer3 = new Zimmer(3);
        Zimmer zimmer4 = new Zimmer(4);
        Zimmer zimmer5 = new Zimmer(5);
        Zimmer zimmer6 = new Zimmer(6);
        Zimmer zimmer7 = new Zimmer(7);
        Zimmer zimmer8 = new Zimmer(8);

        Etage etage1GE1 = new Etage("E1");
        etage1GE1.getZimmerListe().add(zimmer1);

        Etage etage2GE1 = new Etage("E2");
        etage2GE1.getZimmerListe().add(zimmer2);

        Etage etage3GE1 = new Etage("E3");
        etage3GE1.getZimmerListe().add(zimmer3);
        etage1GE1.getZimmerListe().add(zimmer6);

        Etage etage1GE2 = new Etage("E1");
        etage1GE2.getZimmerListe().add(zimmer4);
        etage1GE1.getZimmerListe().add(zimmer7);

        Etage etage2GE2 = new Etage("E2");
        etage2GE2.getZimmerListe().add(zimmer5);
        etage1GE1.getZimmerListe().add(zimmer8);


        Gebaeude gebaeude1 = new Gebaeude("G1");
        gebaeude1.getEtagenListe().add(etage1GE1);
        gebaeude1.getEtagenListe().add(etage2GE1);
        gebaeude1.getEtagenListe().add(etage3GE1);

        Gebaeude gebaeude2 = new Gebaeude("G2");
        gebaeude2.getEtagenListe().add(etage1GE2);
        gebaeude2.getEtagenListe().add(etage2GE2);

        Hotelanlage hotelanlage = new Hotelanlage("Resort", adresse);
        hotelanlage.getHausListe().add(gebaeude1);
        hotelanlage.getHausListe().add(gebaeude2);


        ////Checkin
        //try {
        //    zimmer1.checkin(olaf);
        //    zimmer1.checkin(olaf);
        //    zimmer4.checkin(karl);
        //    zimmer7.checkin(max);
        //    zimmer5.checkin(erich);
        //}catch (GastAlreadyCheckedinException e){
        //    System.out.println(e.getMessage());
        //}
        //System.out.println(hotelanlage);

        gastDAO gastDao = new gastDAO();
        try {
            gastDao.insert(olaf);
            gastDao.insert(karl);
        } catch (GastVorhandenException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(gastDao.findAll());
        try {
            olaf.setNachname("Härtel");
            gastDao.update(olaf);
        } catch (GastNichtVorhandenException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(gastDao.findById(olaf.getGastNr()));
        } catch (GastNichtVorhandenException e) {
            System.out.println(e.getMessage());
        }
        try {
            gastDao.remove(olaf);
        } catch (GastNichtVorhandenException e) {
            System.out.println(e.getMessage());
        }
        try {
            gastDao.remove(olaf);
        } catch (GastNichtVorhandenException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(gastDao.findAll());
    }


}
