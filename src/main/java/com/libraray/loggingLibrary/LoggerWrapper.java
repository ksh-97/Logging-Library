package com.libraray.loggingLibrary;

public interface LoggerWrapper {
    void info(String message);
    void debug(String message);
    void warn(String message);
    void error(String message, Throwable t);
}
