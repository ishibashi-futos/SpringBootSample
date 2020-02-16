package com.example.sample.app;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class LoadReportDefinition {

  @PostConstruct
  public static void initAfterStartup() {
    System.out.println("init after startup");
  }

}
