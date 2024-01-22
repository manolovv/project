package com.manolov.architecture;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Engine {
    private final EngineFuel engineFuel;
    private final TypeOfCooling typeOfCooling;
    private final int numberOfCylinders;
    private final int cubicCapacity;
    private final int horsePower;

    @JsonCreator
    public Engine(@JsonProperty("engineFuel") EngineFuel engineFuel,
                  @JsonProperty("typeOfCooling") TypeOfCooling typeOfCooling,
                  @JsonProperty("numberOfCylinders") int numberOfCylinders,
                  @JsonProperty("cubicCapacity") int cubicCapacity,
                  @JsonProperty("horsePower") int horsePower) {
        this.engineFuel = engineFuel;
        this.typeOfCooling = typeOfCooling;
        this.numberOfCylinders = numberOfCylinders;
        this.cubicCapacity = cubicCapacity;
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public EngineFuel getEngineFuel() {
        return engineFuel;
    }

    public TypeOfCooling getTypeOfCooling() {
        return typeOfCooling;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public long getCubicCapacity() {
        return cubicCapacity;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineFuel=" + engineFuel +
                ", typeOfCooling=" + typeOfCooling +
                ", numberOfCylinders=" + numberOfCylinders +
                ", cubicCapacity=" + cubicCapacity +
                ", horsePower=" + horsePower +
                '}';
    }
}
