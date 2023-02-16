import java.util.HashMap;
import java.util.List;

public class GastDao extends Exception {

    private int GastNr;

    HashMap<Integer, Gast> GastMap = new HashMap<>();

    public void insert(Gast gast) throws GastVorhandenExeption {
       if (GastMap.containsKey(GastNr)) {
           throw new GastVorhandenExeption();
       }
        GastMap.put(GastNr, gast);
    }

  // public Gast findById(int gastNr) throws GastNichtVorhandenExeption{
  //     if (GastMap.containsKey(GastNr)) {
  //         return ;
  //     }
  //     throw new GastNichtVorhandenExeption();
  // }

  // public List<Gast> findAll(){
  //     for(GastNr : GastMap.keySet())
  //     {
  //         System.out.print("Key: " + GastNr + " - ");
  //         System.out.print("Value: " + GastMap.get(GastNr) + "\n");
  //     }
  // }


}
