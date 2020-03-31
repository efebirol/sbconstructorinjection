package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CarEngine;

import lombok.extern.slf4j.Slf4j;


/**
 * Handhabung: Einfach den Haupttest ausführen und die Logs anschauen
 * 
 * @author Efe
 */
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

  /*
   * Property/Field injection
   * "CarEngine"-Component-Klasse wird hier eingebunden in die Controller
   */
  @Autowired
  CarEngine engine;

  CarEngine setterInjEngine;

  /*
   * Setter Injection
   * "CarEngine"-Component-Klasse wird hier eingebunden in die Controller
   */
  @Autowired
  private void setCarEngine(CarEngine engineProp)
  {
    log.info("Setter Injection für die CarEngine-Klasse");
    this.setterInjEngine = engineProp;
  }

  /**
   * Show usage of Property and Setter Injection
   * Hinweis: Er wird nur eine "CarEngine"-Bean im SpringContext angelegt und von beiden Methoden benutzt/überschrieben
   */
  @GetMapping(value = "/auto")
  public void showCarsBeans()
  {
    log.info("Property/Field injection:");
    log.info("- Car: {}", engine.getEngineName());

    log.info("Setter Injection:");
    setterInjEngine.setEngineName("FordEngine");
    log.info("- Car: {}", setterInjEngine.getEngineName());
  }

  // Constructor injection


}
