package com.programacho;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.message.StringMapMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.util.Map;
import java.util.UUID;

public class EcsLoggingGymApplication {

    public static void main(String[] args) {
        logback();
        log4j2();
    }

    private static void logback() {
        Logger log = LoggerFactory.getLogger(EcsLoggingGymApplication.class);
        MDC.put("labels.user", "hainet50b");
        MDC.put("labels.request_id", UUID.randomUUID().toString());

        log.info("Hello ECS!");
    }

    private static void log4j2() {
        org.apache.logging.log4j.Logger log = LogManager.getLogger(EcsLoggingGymApplication.class);

        log.info(new StringMapMessage()
                .with("message", "Hello ECS!")
                .with("labels", Map.of(
                        "user", "hainet50b",
                        "request_id", UUID.randomUUID().toString()
                ))
        );
    }

}
