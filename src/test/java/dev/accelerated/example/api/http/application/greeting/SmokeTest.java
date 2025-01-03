package dev.accelerated.example.api.http.application.greeting;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
public class SmokeTest {

    @Autowired
    private GreetingController controller;

    @Test
    void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }
}
