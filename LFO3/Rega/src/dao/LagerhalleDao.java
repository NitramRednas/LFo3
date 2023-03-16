package dao;

import buissnesObjects.Lagerhalle;
import buissnesObjects.LagerhalleNichtVorhandenException;
import buissnesObjects.LagerhalleVorhandenException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LagerhalleDao {
    Map<String, Lagerhalle> lagerMap = new HashMap<>();


    public void insert(Lagerhalle lager) throws LagerhalleVorhandenException {
        if (lagerMap.containsKey(lager.getLagerNr())) {
            throw new LagerhalleVorhandenException(lager.getLagerNr());
        } else {
            lagerMap.put(lager.getLagerNr(), lager);
        }
    }

    public Lagerhalle findById(String lagerNr) throws LagerhalleNichtVorhandenException {
        if (!lagerMap.containsKey(lagerNr)) {
            throw new LagerhalleNichtVorhandenException(lagerNr);
        }
        return lagerMap.get(lagerNr);
    }

    public List<Lagerhalle> findAll() {
        return lagerMap.values().stream().toList();
    }

    public void update(Lagerhalle lager) throws LagerhalleNichtVorhandenException {
        if (!lagerMap.containsKey(lager.getLagerNr())) {
            throw new LagerhalleNichtVorhandenException(lager.getLagerNr());
        }
        lagerMap.replace(lager.getLagerNr(), lager);
    }

    public void remove(Lagerhalle lager) throws LagerhalleNichtVorhandenException {
        if (!lagerMap.containsKey(lager.getLagerNr())) {
            throw new LagerhalleNichtVorhandenException(lager.getLagerNr());
        }
        lagerMap.remove(lager.getLagerNr(), lager);
    }
}
