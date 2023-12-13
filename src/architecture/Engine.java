package architecture;

public class Engine {
    private final EngineFuel engineFuel;
    private final TypeOfCooling typeOfCooling;
    private final int numberOfCylinders;
    private final int cubicCapacity;
    private final int horsePower;

    public Engine(EngineFuel engineFuel, TypeOfCooling typeOfCooling,
                  int numberOfCylinders, int cubicCapacity, int horsePower) {
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
}
