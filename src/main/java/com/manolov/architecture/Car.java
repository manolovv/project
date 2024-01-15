package com.manolov.architecture;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.List;

public class Car extends Vehicle {
    private final String type = "Car";
    private final int numberOfDoors;
    private final CarCategory carCategory;

    @JsonCreator
    public Car(@JsonProperty("dataOfManufacture") LocalDate dataOfManufacture,
               @JsonProperty("firstRegister") LocalDate firstRegister,
               @JsonProperty("brand") Brand brand,
               @JsonProperty("model") Model model,
               @JsonProperty("features") List<FeatureName> features,
               @JsonProperty("engine") Engine engine,
               @JsonProperty("transmission") TransmissionChoice transmission,
               @JsonProperty("euroStandard") EuroStandard euroStandard,
               @JsonProperty("milleAge") long milleAge,
               @JsonProperty("color") Color color,
               @JsonProperty("numberOfDoors") int numberOfDoors,
               @JsonProperty("carCategory") CarCategory carCategory) {
        super(dataOfManufacture, firstRegister, brand, model, features, engine,
                transmission, euroStandard, milleAge, color);
        this.numberOfDoors = numberOfDoors;
        this.carCategory = carCategory;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public CarCategory getCarCategory() {
        return carCategory;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + getNumberOfDoors() +
                ", carCategory=" + getCarCategory() +
                "} " + super.toString();
    }
}
