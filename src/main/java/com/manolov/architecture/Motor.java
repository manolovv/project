package com.manolov.architecture;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.List;

public class Motor extends Vehicle {
    private static final String MOTOR_TYPE = "Motor";
    private final MotorCategory motorCategory;

    @JsonCreator
    public Motor(@JsonProperty("dataOfManufacture")LocalDate dataOfManufacture,
                 @JsonProperty("firstRegister") LocalDate firstRegister,
                 @JsonProperty("brand") Brand brand,
                 @JsonProperty("model") Model model,
                 @JsonProperty("features") List<FeatureName> features,
                 @JsonProperty("engine") Engine engine,
                 @JsonProperty("transmission") TransmissionChoice transmission,
                 @JsonProperty("euroStandard") EuroStandard euroStandard,
                 @JsonProperty("milleAge") long milleAge,
                 @JsonProperty("color") Color color,
                 @JsonProperty("motorCategory") MotorCategory motorCategory) {
        super(dataOfManufacture, firstRegister, brand, model, features,
                engine, transmission, euroStandard, milleAge,
                color);
        this.motorCategory = motorCategory;
    }

    public MotorCategory getMotorCategory() {
        return motorCategory;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "motorCategory=" + getMotorCategory() +
                "} " + super.toString();
    }
}
