package panachainy.java.app.model;

import lombok.Data;

@Data
public class VersionResponse {
    public VersionResponse(String version) {
        this.version = version;
    }

    String version;
}
