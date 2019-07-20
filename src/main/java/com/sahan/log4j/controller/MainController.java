package com.sahan.log4j.controller;

import com.sahan.log4j.SpringBootLog4jExampleApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class MainController {
    private static Logger logger = LogManager.getLogger(MainController.class);
    @RequestMapping(value = "/helloWorld")
    private String helloWorld(){
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
        return "Hello World";
    }
}
