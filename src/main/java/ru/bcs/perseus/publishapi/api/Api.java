package ru.bcs.perseus.publishapi.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface Api {

  @GetMapping("/api/example/{id}")
  void doSomething(@PathVariable String id);
}
