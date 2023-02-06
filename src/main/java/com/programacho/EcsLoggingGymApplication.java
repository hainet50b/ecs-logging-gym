package com.programacho;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class EcsLoggingGymApplication {

    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(EcsLoggingGymApplication.class);
        MDC.put("mdc.key", "mdc.value");

        log.info("Hello World!");
    }
}
