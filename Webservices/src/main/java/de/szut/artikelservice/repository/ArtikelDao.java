package de.szut.artikelservice.repository;
import de.szut.artikelservice.model.Artikel;
import org.springframework.stereotype.Repository;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;

@Repository
public class ArtikelDao {

    HashMap<Long, Artikel> artikelMap = new HashMap<Long, Artikel>();

    public void insert(Artikel artikel) {
        if (!artikelMap.containsKey(artikel.getId())){
            artikelMap.put(artikel.getId(), artikel);
        }
    }

    public Artikel findById(Long artikelNr){
        if (!artikelMap.containsKey(artikelNr)){
            System.out.println("Artikel nicht vorhanden");
            return null;
        }
        return artikelMap.get(artikelNr);
    }

    public List<Artikel> findAll(){
        return artikelMap.values().stream().toList();
    }

    public void updateArtikel(Artikel artikel){
        if (artikelMap.containsKey(artikel.getId())){
            artikelMap.replace(artikel.getId(), artikel);
        }

    }

    public void delete(Long id){
        if (artikelMap.containsKey(id)){
            artikelMap.remove(id);
        }
    }
}
