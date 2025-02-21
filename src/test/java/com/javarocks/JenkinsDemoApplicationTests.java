package com.javarocks;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class JenkinsDemoApplicationTests {
	public static Logger log= LoggerFactory.getLogger(JenkinsDemoApplicationTests.class);

	@Test
	public void contextLoads() {
		log.info("Test case executing...");
		log.info("Jenkins pipeline added...");
		assertEquals(true, true);
	}

}
