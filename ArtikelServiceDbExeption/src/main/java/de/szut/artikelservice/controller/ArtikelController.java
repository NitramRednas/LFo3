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
    public List<Artikel> getArtikel() {
        List<Artikel> artikelList = artikelService.read();
        return artikelService.read();
    }

    @GetMapping(value= "/{id}")
    public Artikel getArtikel(@PathVariable long id){
        Artikel artikel = artikelService.read(id);
        return artikelService.read(id);
    }

    @PostMapping
    public Artikel addArtikel(@RequestBody Artikel request){
        Artikel artikel = artikelService.add(request);
        return artikelService.read(artikel.getId());
    }

    @PutMapping
    public Artikel updateArtikel(@RequestBody Artikel request){
        artikelService.update(request);
        return artikelService.read(request.getId());
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteArtikel(@PathVariable long id){
        artikelService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
