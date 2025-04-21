package exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDate;


@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({NotFoundException.class})
    public ResponseEntity<Object> handleNotFound(RuntimeException ex, WebRequest request){
        ErrorMessage error = new ErrorMessage(
                LocalDate.now(),
                HttpStatus.BAD_REQUEST.value(),
                "Client Error",
                ex.getMessage(),
                request.getDescription(false).replace("url=","")
        );
    return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

}
