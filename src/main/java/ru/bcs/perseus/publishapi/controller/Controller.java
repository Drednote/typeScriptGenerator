package ru.bcs.perseus.publishapi.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.bcs.perseus.publishapi.api.Api;
import ru.bcs.perseus.publishapi.feign.ExampleFeignClient;

@Slf4j
@RestController
@RequiredArgsConstructor
public class Controller implements Api {

  private final ExampleFeignClient exampleFeignClient;

  @Override
  public void doSomething(String id) {
    log.info("Execute method 'doSomething' for id {}", id);
  }

  @GetMapping("/api/call-feign/{id}")
  public void callFeign(@PathVariable String id) {
    exampleFeignClient.doSomething(id);
  }
}
