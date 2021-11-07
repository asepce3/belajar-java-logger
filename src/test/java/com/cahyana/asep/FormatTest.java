package com.cahyana.asep;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FormatTest {

    private static final Logger log = LoggerFactory.getLogger(MainTest.class);

    @Test
    void testLogFormat() {
        log.info("Tanpa parameter");
        log.info("{} + {} = {}", 10, 10, (10+10));
        log.error("Gagal", new NullPointerException());
    }
}
