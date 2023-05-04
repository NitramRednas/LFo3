package exeption;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class ArtikelBereitsVorhandenExeption extends RuntimeException{

    public ArtikelBereitsVorhandenExeption(String message){super(message);}

    @ExceptionHandler(ArtikelBereitsVorhandenExeption.class)
    public ResponseEntity<?> handleArtikelBereitsVorhandenExeption(
            ArtikelBereitsVorhandenExeption ex,
            WebRequest request) {
        ExceptionDetails ed = new ExceptionDetails(
                new Date(),
                ex.getMessage(),
                request.getDescription(false));
        return new ResponseEntity<>(ed, HttpStatus.CONFLICT);
    }
}
