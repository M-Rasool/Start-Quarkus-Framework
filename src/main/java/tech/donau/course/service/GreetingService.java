package tech.donau.course.service;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import tech.donau.course.config.Base64Value;
import tech.donau.course.config.GreetingConfig;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.UUID;

@ApplicationScoped
public class GreetingService {

    @ConfigProperty(name = "greeting.base64name")
    Base64Value base64name;

    @Inject
    GreetingConfig greetingConfig;

    public String sayHello() {
        return "Hello " +
                base64name +
                ", you are from " +
                greetingConfig.getCountry().getName();
    }

    public String sayHello(String name) {
        return String.format("Hello %s, your id is %s",
                name,
                UUID.randomUUID().toString()
        );
    }
}
