package tech.donau.course.config;

import java.util.Base64;

public class Base64Value {
    private String value;

    public Base64Value(String value) {
        this.value = new String(Base64.getDecoder().decode(value));
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
