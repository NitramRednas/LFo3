package de.szut.artikelservice.controller;

import de.szut.artikelservice.model.Artikel;
import de.szut.artikelservice.service.ArtikelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mayappdata/articles")
public class ArtikelController {

    private ArtikelService artikelService;

    public ArtikelController(){
        artikelService = new ArtikelService();
    }

    @GetMapping
    public ResponseEntity<List<Artikel>> getArtikel() {
        List<Artikel> artikelList = artikelService.read();
        return new ResponseEntity<>(artikelList, HttpStatus.OK);
    }

}
