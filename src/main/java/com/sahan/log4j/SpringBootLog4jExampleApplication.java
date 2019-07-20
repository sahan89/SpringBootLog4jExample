package com.sahan.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLog4jExampleApplication {

    private static Logger logger = LogManager.getLogger(SpringBootLog4jExampleApplication.class);

    public static void main(String[] args) {
        logger.info("Starting Spring Boot application..");
        SpringApplication app = new SpringApplication(SpringBootLog4jExampleApplication.class);
        app.run(args);
    }

}
