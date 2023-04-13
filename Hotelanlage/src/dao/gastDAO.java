package dao;

import bo.Gast;
import bo.GastNichtVorhandenException;
import bo.GastVorhandenException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gastDAO {
    Map<Integer, Gast> gastMap = new HashMap<>();


    public void insert(Gast gast) throws GastVorhandenException {
        if (gastMap.containsKey(gast.getGastNr())) {
            throw new GastVorhandenException(gast.getGastNr());
        } else {
            gastMap.put(gast.getGastNr(), gast);
        }
    }

    public Gast findById(int gastNr) throws GastNichtVorhandenException {
        if (!gastMap.containsKey(gastNr)) {
            throw new GastNichtVorhandenException(gastNr);
        }
        return gastMap.get(gastNr);
    }

    public List<Gast> findAll() {
        return gastMap.values().stream().toList();
    }

    public void update(Gast gast) throws GastNichtVorhandenException {
        if (!gastMap.containsKey(gast.getGastNr())) {
            throw new GastNichtVorhandenException(gast.getGastNr());
        }
        gastMap.replace(gast.getGastNr(), gast);
    }

    public void remove(Gast gast) throws GastNichtVorhandenException {
        if (!gastMap.containsKey(gast.getGastNr())) {
            throw new GastNichtVorhandenException(gast.getGastNr());
        }
        gastMap.remove(gast.getGastNr(), gast);
    }
}
