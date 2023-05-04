package de.szut.artikelservice.controller;

import de.szut.artikelservice.model.Artikel;
import de.szut.artikelservice.service.ArtikelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/myappdata/articles")
public class ArtikelController {
    @Autowired
    private ArtikelService artikelService;

    @GetMapping
    public ResponseEntity<List<Artikel>> getArtikel() {
        List<Artikel> artikelList = artikelService.read();
        return new ResponseEntity<>(artikelList, HttpStatus.OK);
    }

    @GetMapping(value= "/{id}")
    public ResponseEntity<Artikel> getArtikel(@PathVariable long id){
        Artikel artikel = artikelService.read(id);
        return new ResponseEntity<>(artikel, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Artikel> addArtikel(@RequestBody Artikel request){
        Artikel artikel = artikelService.add(request);
        return new ResponseEntity<>(artikel, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> updateArtikel(@RequestBody Artikel request){
        artikelService.update(request);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteArtikel(@PathVariable long id){
        artikelService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
