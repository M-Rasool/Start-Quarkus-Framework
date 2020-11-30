package tech.donau.course.service;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;
import tech.donau.course.config.Base64Value;
import tech.donau.course.config.GreetingConfig;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.UUID;

@ApplicationScoped
public class GreetingService {

    private static Logger LOGGER = Logger.getLogger(GreetingService.class.getName());

    @Inject
    GreetingConfig greetingConfig;

    public String sayHello() {
        LOGGER.debug("Saying hello to random user");
        return "Hello " +
                greetingConfig.getName() +
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
