package com.example.sample.app;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class LoadReportDefinition {
	@PostConstruct
	public static void initAfterStartup() {
		System.out.println("init after startup");
	}
}
