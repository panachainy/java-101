package panachainy.java.app.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import panachainy.java.app.model.ExternalStatus;
import panachainy.java.app.model.ExternalStatusResponse;

@FeignClient(name = "external-status", url = "${external-status.url}", configuration = ExternalStatusClientConfig.class)
public interface ExternalStatusClient {
    @RequestMapping(method = RequestMethod.GET, value = "/status")
    ResponseEntity<ExternalStatus> getStatus();

    @RequestMapping(method = RequestMethod.GET, value = "/status-all")
    ResponseEntity<ExternalStatusResponse> getStatusAll();

    // TODO: try page
    // @RequestMapping(method = RequestMethod.GET, value = "/externalStatus")
    // Page<ExternalStatusResponse> getProducts(Pageable pageable);

    // TODO: try post
    // @RequestMapping(method = RequestMethod.POST, value =
    // "/externalStatus/{storeId}", consumes = "application/json")
    // ExternalStatusResponse update(@PathVariable("id") Long id,
    // ExternalStatusResponse store);

    @RequestMapping(method = RequestMethod.PUT, value = "/status/{key}", consumes = "application/json")
    ResponseEntity<ExternalStatus> put(@PathVariable("key") String key, ExternalStatus value);

    // TODO: try delete
}
