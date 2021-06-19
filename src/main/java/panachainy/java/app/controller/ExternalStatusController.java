package panachainy.java.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import panachainy.java.app.clients.ExternalStatusClient;
import panachainy.java.app.model.ExternalStatus;
import panachainy.java.app.model.ExternalStatusResponse;

@RestController
@RequiredArgsConstructor
public class ExternalStatusController {
    @Autowired
    private final ExternalStatusClient externalStatusClient;

    @GetMapping("/example")
    @ResponseBody
    public ResponseEntity<ExternalStatus> get() {
        ResponseEntity<ExternalStatus> responseStatus = externalStatusClient.getStatus();

        return ResponseEntity.ok(responseStatus.getBody());
    }

    @GetMapping("/example-all")
    @ResponseBody
    public ResponseEntity<ExternalStatusResponse> getAll() {
        ResponseEntity<ExternalStatusResponse> responseStatus = externalStatusClient.getStatusAll();

        return ResponseEntity.ok(responseStatus.getBody());
    }

    // TODO: try exception case
}
