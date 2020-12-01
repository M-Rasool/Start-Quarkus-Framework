package tech.donau.course.data;

import javax.json.bind.annotation.JsonbProperty;

public class Currency {

    private String id;
    private String name;
    @JsonbProperty(value = "price_usd")
    private String priceUsd;

    public Currency() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPriceUsd() {
        return priceUsd;
    }

    public void setPriceUsd(String priceUsd) {
        this.priceUsd = priceUsd;
    }
}
