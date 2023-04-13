package de.szut.artikelservice.service;

import de.szut.artikelservice.model.Artikel;
import de.szut.artikelservice.repository.ArtikelDao;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
public class ArtikelService {

    private ArtikelDao artikelDao;

    public ArtikelService(){
        artikelDao = new ArtikelDao();
    }

    public Artikel add(Artikel artikel){
        artikelDao.insert(artikel);
        return artikelDao.findById(artikel.getId());
    }

    public Artikel read(Long id){
        return artikelDao.findById(id);
    }

    public List<Artikel> read(){
        for (long i = 0; i < read().size(); i++){
            System.out.println(artikelDao.findById(i));
        }return null;
    }

    public Artikel update(Artikel artikel){
        artikelDao.updateArtikel(artikel);
        return artikelDao.findById(artikel.getId());
    }

    public void delete(Long id){
        artikelDao.delete(id);
    }

}
