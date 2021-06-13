package panachainy.java.app.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import panachainy.java.app.model.ExternalStatusResponse;

@FeignClient(name = "external-status", url = "${external-status.url}", configuration = ExternalStatusClientConfig.class)
public interface ExternalStatusClient {
    @RequestMapping(method = RequestMethod.GET, value = "/externalStatus")
    List<ExternalStatusResponse> getProducts();

    @RequestMapping(method = RequestMethod.GET, value = "/externalStatus")
    Page<ExternalStatusResponse> getProducts(Pageable pageable);

    @RequestMapping(method = RequestMethod.POST, value = "/externalStatus/{storeId}", consumes = "application/json")
    ExternalStatusResponse update(@PathVariable("id") Long id, ExternalStatusResponse store);
}
