package exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ArtikelNichtVorhandenExeption extends RuntimeException{

    public ArtikelBereitsVorhandenExeption(String message){super(message);}
}
