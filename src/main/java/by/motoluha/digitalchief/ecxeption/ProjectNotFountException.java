package by.motoluha.digitalchief.ecxeption;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ProjectNotFountException extends RuntimeException {

    public ProjectNotFountException() {
        super();
    }

    public ProjectNotFountException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProjectNotFountException(String message) {
        super(message);
    }

    public ProjectNotFountException(Throwable cause) {
        super(cause);
    }
}
