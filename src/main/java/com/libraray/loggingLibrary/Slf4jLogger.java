package com.libraray.loggingLibrary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jLogger implements LoggerWrapper {
    private final Logger logger;

    public Slf4jLogger(Class<?> clazz) {
        this.logger = LoggerFactory.getLogger(clazz);
    }

    @Override
    public void info(String message) {
        logger.info(message);
    }

    @Override
    public void debug(String message) {
        logger.debug(message);
    }

    @Override
    public void warn(String message) {
        logger.warn(message);
    }

    @Override
    public void error(String message, Throwable t) {
        logger.error(message, t);
    }
}