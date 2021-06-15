package panachainy.java.app.controller;

import org.springframework.web.bind.annotation.*;
import panachainy.java.app.exceptionhandler.CustomException;
import panachainy.java.app.exceptionhandler.ResourceAlreadyExists;
import panachainy.java.app.exceptionhandler.ResourceNotFoundException;
import panachainy.java.app.exceptionhandler.UnauthorizedException;

@RestController
public class testExceptionController {

    @GetMapping("/testExceptionHandling")
    public String testExceptionHandling(@RequestParam int code) {
        switch (code) {
            case 401:
                throw new UnauthorizedException("You are not authorized");
            case 404:
                throw new ResourceNotFoundException("Requested resource is not found.");
            case 400:
                throw new CustomException("Please provide resource id.");
            case 409:
                throw new ResourceAlreadyExists("Resource already exists in DB.");
            default:
                return "No Exception.";
        }
    }

}
