package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Controller
    public class TextController {

        private final Logger logger = LoggerFactory.getLogger(this.getClass());

        @GetMapping(path = "test")
        public String test() {
            logger.debug("This is a debug message");
            logger.info("This is a info message");
            return "test";
        }
    }

}
