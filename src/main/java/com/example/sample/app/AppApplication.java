package com.example.sample.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {

  public static void main(String[] args) {
    System.out.println("doReady");
    SpringApplication.run(AppApplication.class, args);
  }

}
