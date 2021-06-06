package panachainy.java.java.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import panachainy.java.java.property.ApplicationProperties;

@RestController
@RequestMapping("health")
public class HealthController {

    private ApplicationProperties applicationProperties;
    private static final Logger logger = LogManager.getLogger(HealthController.class.getName());


    @GetMapping
    public String get() {
        return "up";
    }

    @GetMapping(value = "/version")
    public ResponseEntity<String> version() {
        logger.info("This is an info log1");
        logger.info("This is an info log2");
        logger.debug("This is an debug log1");
        logger.warn("This is an debug log2");
        logger.error("This is an error log3");
        logger.fatal("This is an error log3");
        return null;
    }

}
