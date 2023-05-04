package de.szut.artikelservice.repository;

import de.szut.artikelservice.model.Artikel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtikelRepository extends JpaRepository<Artikel, Long> {



}
