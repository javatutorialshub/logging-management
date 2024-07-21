package com.javatutorialshub.loggingmanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleComputer {
    private static final Logger logger = LoggerFactory.getLogger(SimpleComputer.class);

    public void compute(){
        try {
            logger.info("Start the calculation");
            double result = Math.pow(100, 100);
            logger.info("End the calculation with result: {}", result);

            logger.info("Start the division");
            double div = Math.divideExact(100, 0);
            logger.info("End the division with result: {}", div);
        } catch (Exception e) {
            logger.warn("Unable to do the calculation because of: " + e.getMessage(), e);
            throw new RuntimeException(e);
        }
    }
}
