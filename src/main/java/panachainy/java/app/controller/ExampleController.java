package panachainy.java.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import panachainy.java.app.clients.ExternalStatusClient;
import panachainy.java.app.model.ExternalStatusResponse;

@RestController
@RequiredArgsConstructor
public class ExampleController {
    @Autowired
    private final ExternalStatusClient externalStatusClient;

    @GetMapping("/example")
    public List<ExternalStatusResponse> get() {

        return externalStatusClient.getProducts();
    }
}
