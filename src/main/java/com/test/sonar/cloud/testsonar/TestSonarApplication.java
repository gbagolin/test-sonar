package com.test.sonar.cloud.testsonar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSonarApplication {

    public static void main(String[] args) {
        System.out.println("ciao");
        System.out.println("test");
        SpringApplication.run(TestSonarApplication.class, args);
    }

}
