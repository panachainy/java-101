package panachainy.java.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import panachainy.java.app.clients.ExternalStatusClient;
import panachainy.java.app.model.ExternalStatus;
import panachainy.java.app.model.ExternalStatusResponse;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ExternalStatusController {
    @Autowired
    private final ExternalStatusClient externalStatusClient;

    @GetMapping("/external-status")
    @ResponseBody
    public ResponseEntity<ExternalStatus> get() {
        ResponseEntity<ExternalStatus> responseStatus = externalStatusClient.getStatus();

        return ResponseEntity.ok(responseStatus.getBody());
    }

    @GetMapping("/external-status-all")
    @ResponseBody
    public ResponseEntity<ExternalStatusResponse> getAll() {
        ResponseEntity<ExternalStatusResponse> responseStatus = externalStatusClient.getStatusAll();

        return ResponseEntity.ok(responseStatus.getBody());
    }

    @PutMapping("/external-status/{key}")
    public ResponseEntity<ExternalStatus> put(@PathVariable("key") String key,
            @RequestBody ExternalStatus model) {
        ResponseEntity<ExternalStatus> responseStatus = externalStatusClient.put(key, model);

        return ResponseEntity.ok(responseStatus.getBody());
    }

    // TODO: try exception case
}
