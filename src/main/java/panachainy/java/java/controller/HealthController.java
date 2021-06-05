package panachainy.java.java.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import panachainy.java.java.property.ApplicationProperties;

@Slf4j
@RestController
@RequestMapping("health")
public class HealthController {

    @Autowired
    private ApplicationProperties applicationProperties;

    @GetMapping
    public String get() {
        return "up";
    }

    @GetMapping(value = "/version")
    public ResponseEntity<String> version() {
        log.info("[info] application version: " + applicationProperties.getVersion());
        return ResponseEntity.ok(applicationProperties.getVersion());
    }
}
