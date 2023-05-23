package ru.bcs.perseus.publishapi.feign;

import org.springframework.cloud.openfeign.FeignClient;
import ru.bcs.perseus.publishapi.api.Api;

@FeignClient(name = "example", url = "http://localhost:8080")
public interface ExampleFeignClient extends Api {
}
