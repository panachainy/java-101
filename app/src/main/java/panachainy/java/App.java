package panachainy.java;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    private static ObjectMapper objectMapper = new ObjectMapper();

    public String greeting() {
        return "Hello, World!";
    }

    @GetMapping("/hello")
    public ResponseEntity<ObjectNode> hello() {
        ObjectNode response = objectMapper.createObjectNode();
        response.put("message", greeting());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
