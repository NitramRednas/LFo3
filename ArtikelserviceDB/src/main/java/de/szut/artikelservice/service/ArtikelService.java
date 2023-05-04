package de.szut.artikelservice.service;

import de.szut.artikelservice.model.Artikel;
import de.szut.artikelservice.repository.ArtikelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtikelService {
    @Autowired
    private ArtikelRepository artikelRepository;


    public Artikel add(Artikel artikel) {
        if (read(artikel.getId()) == null){
            return artikelRepository.save(artikel);
        } else {
            return null;
        }
    }

    public Artikel read(Long id){
        Optional<Artikel> oArtikel = artikelRepository.findById(id);
        if (oArtikel.isEmpty()){
            return null;
        } else {
            return oArtikel.get();
        }
    }

    public List<Artikel> read(){
        return artikelRepository.findAll();
    }

    public Artikel update(Artikel artikel){
        if (read(artikel.getId()) != null){
            return artikelRepository.save(artikel);
        } else {
            return null;
        }
    }

    public void deleteById(Long id){
        artikelRepository.deleteById(id);
    }

}
