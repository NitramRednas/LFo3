package exeption;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ArtikelNichtVorhandenExeption extends RuntimeException{
    public ArtikelNichtVorhandenExeption(String message){super(message);}

    @ExceptionHandler(ArtikelNichtVorhandenExeption.class)
    public ResponseEntity<?> handleArtikelNichtVorhandenException(
            ArtikelNichtVorhandenExeption ex,
            WebRequest request) {
        ExceptionDetails ed = new ExceptionDetails(
                new Date(),
                ex.getMessage(),
                request.getDescription(false));
        return new ResponseEntity<>(ed, HttpStatus.NOT_FOUND);
    }

}
