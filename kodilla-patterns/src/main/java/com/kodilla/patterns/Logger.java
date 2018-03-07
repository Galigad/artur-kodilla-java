package com.kodilla.patterns;

public class Logger {
    private String lastLog = "";
    private static Logger LoggerInstance = null;

    public static Logger getInstance() {
        if (LoggerInstance == null) {
            LoggerInstance = new Logger();
        }
        return LoggerInstance;
    }

    private Logger() {

    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}