package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CarEngine;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/mycontroller")
@Slf4j
// @Scope(value = WebApplicationContext.SCOPE_REQUEST)
public class MyCarController
{

  public MyCarController()
  {
    log.info("Konstruktor");
  }

  // Property/Field injection
  @Autowired
  CarEngine engine;


  // Setter Injection

  // Constructor injection


}
