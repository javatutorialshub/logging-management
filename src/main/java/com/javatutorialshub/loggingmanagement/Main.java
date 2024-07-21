package com.javatutorialshub.loggingmanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("Start the Application");
        new SimpleComputer().compute();
        logger.info("End the Application");
    }
}