package tech.donau.course.config;

import io.quarkus.arc.config.ConfigProperties;

import javax.validation.constraints.Size;

@ConfigProperties(prefix = "greeting")
public class GreetingConfig {

    @Size(max = 10)
    private String name;
    private CountryConfig country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CountryConfig getCountry() {
        return country;
    }

    public void setCountry(CountryConfig country) {
        this.country = country;
    }

    public static class CountryConfig {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
