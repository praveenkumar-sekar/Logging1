package com.demologging.spring_demologging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/Home")
    public String home()  {
        logger.info("[getMessage] info message");
        logger.warn("[getMessage] warn message");
        logger.error("[getMessage] error message");
        logger.debug("[getMessage] debug message");
        logger.trace("[getMessage]trace message");
        return "open console to check log messages";

    }
}
