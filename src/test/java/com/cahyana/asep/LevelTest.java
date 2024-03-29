package com.cahyana.asep;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LevelTest {

    private static final Logger log = LoggerFactory.getLogger(MainTest.class);

    @Test
    void testLevel() {
        log.trace("Trace");
        log.debug("Debut");
        log.info("Info");
        log.warn("Warn");
        log.error("Error");
    }
}
