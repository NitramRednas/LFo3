import java.util.HashMap;

public class ZuschauerDao extends Exception {

        private int zuschauerNr;

        HashMap<Integer, Zuschauer> zuschauerHashMap = new HashMap<>();

        private void insert(Zuschauer zuschauer) throws SitzplatzAngabeInvalideExeption {
            if (zuschauerHashMap.containsKey(zuschauerNr)){
                throw new SitzplatzAngabeInvalideExeption();
            }
            zuschauerHashMap.put(zuschauerNr, zuschauer);
        }

        private void delete(Zuschauer zuschauer) throws SitzplatzAngabeInvalideExeption{
            if (zuschauerHashMap.containsKey(zuschauerNr)){
                zuschauerHashMap.remove(zuschauerNr);
            }
            throw new SitzplatzAngabeInvalideExeption();
        }
}
