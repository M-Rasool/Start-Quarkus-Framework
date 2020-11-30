package tech.donau.course.service;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@QuarkusTest
public class GreetingServiceTest {

    @Inject
    GreetingService greetingService;

    @Test
    void checkReturnsHello() {
        Assertions.assertEquals("Hello Test name, you are from Testland", greetingService.sayHello());
    }
}
