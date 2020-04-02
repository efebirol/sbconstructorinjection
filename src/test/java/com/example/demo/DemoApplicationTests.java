package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.controller.MyCarController;


/*
 * Simple sanity check test that will fail if the application context cannot start.
 * Anwendung: "mvn test" in CMD
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests
{

  @Autowired
  private MyCarController mycontroller;

  /**
   * Einfaches, wichtiger Smoke Test, ob Bean erstellt wird
   */
  @Test
  public void contextLoads()
  {
    assertThat(mycontroller).isNotNull();
  }

}
