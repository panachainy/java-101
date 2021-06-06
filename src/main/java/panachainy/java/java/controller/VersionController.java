package panachainy.java.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("version")
public class VersionController {

    @Autowired
    private BuildProperties buildProperties;

    @GetMapping
    public ResponseEntity<String> version() {
        log.info("[info] application version: " + buildProperties.getVersion());
        return ResponseEntity.ok(buildProperties.getVersion());
    }
}
