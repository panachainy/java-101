package panachainy.java.java.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import panachainy.java.java.property.ApplicationProperties;

@RestController
@RequestMapping("health")
public class HealthController {
    private static final Logger logger = LogManager.getLogger(HealthController.class.getName());

    @GetMapping
    public String get() {
        return "up";
    }

    @GetMapping(value = "/version")
    public ResponseEntity<String> version() {
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        logger.fatal("This is a fatal message");
        return null;
    }

}
