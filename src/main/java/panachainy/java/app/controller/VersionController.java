package panachainy.java.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import panachainy.java.app.model.VersionResponse;

@Slf4j
@RestController
@RequestMapping("version")
public class VersionController {

    @Autowired
    private BuildProperties buildProperties;

    @GetMapping
    @ResponseBody
    public ResponseEntity<VersionResponse> version() {
        log.info("[info] application version: " + buildProperties.getVersion());
        return ResponseEntity.ok(new VersionResponse(buildProperties.getVersion()));
    }
}
