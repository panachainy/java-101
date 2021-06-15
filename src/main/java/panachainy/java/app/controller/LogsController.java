package panachainy.java.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class LogsController {

    @GetMapping("/logs")
    public String logs() {
        for (int i = 1; i < 100000; i++) {
            log.info("application log info");
            log.warn("application log warning");
            log.error("application log error");
        }
        return "logging..";
    }
}
