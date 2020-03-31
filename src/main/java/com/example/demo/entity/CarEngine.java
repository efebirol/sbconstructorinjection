package com.example.demo.entity;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;


@Component
@Slf4j
public class CarEngine
{

  public CarEngine()
  {
    log.info("Konstruktor");
  }

}
