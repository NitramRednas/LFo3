package dao;

import bO.Zuschauer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class zuschauerDao {
    private static zuschauerDao instance;
    Map<String, Zuschauer> zuschauerMap = new HashMap<>();

    public static zuschauerDao getInstance(){
        if(instance == null){
            instance = new zuschauerDao();
        }
        return instance;
    }

    public void Insert(Zuschauer zuschauer) throws ZuschauerVorhandenException {
        if (!zuschauerMap.containsKey(zuschauer.getAusweisNr())){
            zuschauerMap.put(zuschauer.getAusweisNr(), zuschauer);
        }
        throw new ZuschauerVorhandenException(zuschauer.getAusweisNr());
    }

    public Zuschauer findById(String ausweisNr) throws ZuschauerNichtVorhandenException {
        if (zuschauerMap.containsKey(ausweisNr)){
            return zuschauerMap.get(ausweisNr);
        }
        throw new ZuschauerNichtVorhandenException(ausweisNr);
    }
    public List<Zuschauer> findAll(){
        return zuschauerMap.values().stream().toList();
    }

    public void remove(Zuschauer zuschauer) throws ZuschauerNichtVorhandenException {
        if (!zuschauerMap.containsKey(zuschauer.getAusweisNr())){
            throw new ZuschauerNichtVorhandenException(zuschauer.getAusweisNr());
        }
        zuschauerMap.remove(zuschauer.getAusweisNr());
    }

    public void update(Zuschauer zuschauer) throws ZuschauerNichtVorhandenException {
        if (zuschauerMap.containsKey(zuschauer.getAusweisNr())){
            zuschauerMap.replace(zuschauer.getAusweisNr(), zuschauer);
        }
        throw new ZuschauerNichtVorhandenException(zuschauer.getAusweisNr());
    }
}
