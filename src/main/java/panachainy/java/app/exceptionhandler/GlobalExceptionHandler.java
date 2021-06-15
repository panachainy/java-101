package panachainy.java.app.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String resourceNotFound(ResourceNotFoundException ex) {
        return ex.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(ResourceAlreadyExists.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    String resourceAlreadyExists(ResourceAlreadyExists ex) {
        return ex.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(UnauthorizedException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    String unauthorizedException(UnauthorizedException ex) {
        return ex.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(CustomException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String customException(CustomException ex) {
        return ex.getMessage();
    }

}
