package com.programacho;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EcsLoggingGymApplication {

    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(EcsLoggingGymApplication.class);

        log.info("Hello World!");
        log.warn("WARN");
        log.error("ERROR");
    }
}
