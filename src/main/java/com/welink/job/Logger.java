package com.welink.job;

class Logger {
    public static synchronized void log(String message) {
        System.out.print(message);
    }
}
