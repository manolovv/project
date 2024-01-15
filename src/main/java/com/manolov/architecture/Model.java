package com.manolov.architecture;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Model {
    private final ModelName name;
    private final Brand brand;

    @JsonCreator
    public Model(@JsonProperty("name") ModelName name,
                 @JsonProperty("brandName") Brand brandName) {
        this.name = name;
        this.brand = brandName;
    }
    public ModelName getName() {
        return name;
    }

    public Brand getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name=" + name +
                '}';
    }
}
