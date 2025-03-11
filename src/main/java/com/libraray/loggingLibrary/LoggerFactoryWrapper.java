package com.libraray.loggingLibrary;

import org.springframework.stereotype.Component;

@Component
public class LoggerFactoryWrapper {
    public LoggerWrapper getLogger(Class<?> clazz) {
        return new Slf4jLogger(clazz); // Can be switched to Log4j2 later
    }
}