package by.motoluha.digitalchief.ecxeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class DeveloperNotFoundException extends RuntimeException {

    public DeveloperNotFoundException() {
        super();
    }

    public DeveloperNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public DeveloperNotFoundException(String message) {
        super(message);
    }

    public DeveloperNotFoundException(Throwable cause) {
        super(cause);
    }
}
