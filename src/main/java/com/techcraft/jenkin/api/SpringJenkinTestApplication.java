package com.techcraft.jenkin.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinTestApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinTestApplication.class);

	public void init() {
		logger.info("Application is started...");
	}

	public static void main(String[] args) {
		logger.info("Application is start executing...");
		SpringApplication.run(SpringJenkinTestApplication.class, args);
		logger.info("Application is stopped execution...");

	}

}
