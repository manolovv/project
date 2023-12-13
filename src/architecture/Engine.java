package architecture;

public class Engine {
    private final EngineFuel engineFuel;
    private final TypeOfCooling typeOfCooling;
    private final int NumberOfCylinders;
    private final long cubicCapacity;
    private final int horsePower;

    public Engine(EngineFuel engineFuel, TypeOfCooling typeOfCooling,
                  int numberOfCylinders, long cubicCapacity, int horsePower) {
        this.engineFuel = engineFuel;
        this.typeOfCooling = typeOfCooling;
        NumberOfCylinders = numberOfCylinders;
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
        return NumberOfCylinders;
    }

    public long getCubicCapacity() {
        return cubicCapacity;
    }
}
