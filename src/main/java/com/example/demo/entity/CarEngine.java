package com.example.demo.entity;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;


@Component
@Slf4j
@Getter
@Setter
public class CarEngine
{

  String engineName = "v8";

  /**
   * Wird über den "MyCarController" eingebunden
   */
  public CarEngine()
  {
    log.info("Konstruktor");
  }

}
