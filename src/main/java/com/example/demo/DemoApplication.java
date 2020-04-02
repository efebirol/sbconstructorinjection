package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import lombok.extern.slf4j.Slf4j;


@SpringBootApplication
@Slf4j
@ComponentScan({"com.example.demo"})
public class DemoApplication implements CommandLineRunner
{

  private static ApplicationContext appContext;

  public static void main(String[] args)
  {
    SpringApplication.run(DemoApplication.class, args);

  }

  /*
   * This will print all the beans from applicationContext container (alternative Actuator "/actuator/beans"):
   */

  @Bean
  public CommandLineRunner run(ApplicationContext appContext)
  {
    return args -> {

      String[] beans = appContext.getBeanDefinitionNames();
      log.info("Spring Bean Übersicht - Start");
      Arrays.stream(beans).sorted().forEach(System.out::println);
      log.info("Spring Bean Übersicht - Ende");

    };
  }

  @Override
  public void run(String... args) throws Exception
  {
    // TODO Auto-generated method stub

  }
}
