package com.libraray.loggingLibrary;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
    private final LoggerWrapper log;

    public TestController(LoggerFactoryWrapper loggerFactory) {
        this.log = loggerFactory.getLogger(TestController.class);
    }

    @GetMapping("/test")
    public String testLogging() {
        log.info("Info log from API");
        log.debug("Debug log (won't appear by default)");
        log.warn("Warning log");
        log.error("Error log", new RuntimeException("Test Exception"));

        return "Check the logs!";
    }
}

