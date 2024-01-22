package com.manolov.architecture;
import com.fasterxml.jackson.annotation.*;

import java.time.LocalDate;
import java.util.List;
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Car.class, name = "Car"),
        @JsonSubTypes.Type(value = Motor.class, name = "Motor")
})
public abstract class Vehicle {
    private final LocalDate dataOfManufacture;
    private final LocalDate firstRegister;
    private final Brand brand;
    private final Model model;
    private final Engine engine;
    private final List<FeatureName> features;
    private final TransmissionChoice transmission;
    private final EuroStandard euroStandard;
    private final long milleAge;
    private final Color color;

    @JsonCreator
    protected Vehicle(@JsonProperty("dataOfManufacture")LocalDate dataOfManufacture,
                      @JsonProperty("firstRegister") LocalDate firstRegister,
                      @JsonProperty("brand") Brand brand,
                      @JsonProperty("model") Model model,
                      @JsonProperty("features") List<FeatureName> features,
                      @JsonProperty("engine") Engine engine,
                      @JsonProperty("transmission") TransmissionChoice transmission,
                      @JsonProperty("euroStandard") EuroStandard euroStandard,
                      @JsonProperty("milleAge") long milleAge,
                      @JsonProperty("color") Color color) {
        this.dataOfManufacture = dataOfManufacture;
        this.firstRegister = firstRegister;
        this.brand = brand;
        this.model = model;
        this.features = features;
        this.engine = engine;
        this.transmission = transmission;
        this.euroStandard = euroStandard;
        this.milleAge = milleAge;
        this.color = color;
    }

    public LocalDate getDataOfManufacture() {
        return dataOfManufacture;
    }

    public LocalDate getFirstRegister() {
        return firstRegister;
    }

    public Brand getBrand() {
        return brand;
    }
    public Model getModel() {
        return model;
    }
    public List<FeatureName> getFeatures() {
        return features;
    }

    public Engine getEngine() {
        return engine;
    }

    public TransmissionChoice getTransmission() {
        return transmission;
    }

    public EuroStandard getEuroStandard() {
        return euroStandard;
    }

    public long getMilleAge() {
        return milleAge;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "dataOfManufacture=" + getDataOfManufacture() +
                ", firstRegister=" + getFirstRegister() +
                ", brand=" + getBrand() +
                ", model=" + getModel() +
                ", engine=" + getEngine() +
                ", features=" + getFeatures() +
                ", transmission=" + getTransmission() +
                ", euroStandard=" + getEuroStandard() +
                ", milleAge=" + getMilleAge() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
