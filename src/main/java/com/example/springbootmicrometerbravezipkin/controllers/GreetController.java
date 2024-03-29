package com.example.springbootmicrometerbravezipkin.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class GreetController {

  @GetMapping("/greet/{name}")
  public String greet(@PathVariable("name") String name) {
    log.info("Request received to greet {}", name);
    return String.format("Hello %s", name);
  }
}

