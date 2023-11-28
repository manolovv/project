package architecture;

public class Motor extends Vehicle {
    private int engineType;
    private String typeOfCooling;
    private String category;

    public Motor(String brand, String model,
          String engineFuel, String transmission, String color,
          int dataOfManufacture, int cubeCapacity, long milleAge,
          int price, String typeOfCooling, int engineType, String category) {

        super(brand, model,
                engineFuel, transmission, color,
                dataOfManufacture, cubeCapacity, milleAge, price);
        this.engineType = engineType;
        this.typeOfCooling = typeOfCooling;
        this.category = category;
    }

    public int getEngineType() {
        return engineType;
    }

    public String getTypeOfCooling() {
        return typeOfCooling;
    }

    public String getCategory() {
        return category;
    }

    public void setEngineType(int engineType) {
        this.engineType = engineType;
    }

    public void setTypeOfCooling(String typeOfCooling) {
        this.typeOfCooling = typeOfCooling;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "\nHere is information about the architecture.Motor: " +
                "\nBrand: " + getBrand() +
                "\nModel: " + getModel() +
                "\narchitecture.Motor type: " + getEngineFuel() +
                "\nTransmission: " + getTransmission() +
                "\nColor: " + getColor() +
                "\nData of manufacture: " + getDataOfManufacture() +
                "\nCube capacity: " + getCubeCapacity() +
                "\nMille age: " + getMilleAge() +
                "\nType of cooling: " + getTypeOfCooling() +
                "\nCategory: " + getCategory() +
                "\nEngine type: " + getEngineType() +
                "\nPrice: " + getPrice();
    }
}

