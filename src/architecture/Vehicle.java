package architecture;

public abstract class Vehicle extends Safety{
    private String brand;
    private String model;
    private String engineFuel;
    private String transmission;
    private String color;
    private int dataOfManufacture;
    private int cubeCapacity;
    private long milleAge;
    private int price;

    protected Vehicle(String brand, String model,
                   String engineFuel, String transmission, String color,
                   int dataOfManufacture, int cubeCapacity, long milleAge, int price) {
        this.brand = brand;
        this.model = model;
        this.engineFuel = engineFuel;
        this.transmission = transmission;
        this.color = color;
        this.dataOfManufacture = dataOfManufacture;
        this.cubeCapacity = cubeCapacity;
        this.milleAge = milleAge;
        this.price = price;
    }

    protected String getBrand() {
        return brand;
    }

    protected String getModel() {
        return model;
    }

    protected int getDataOfManufacture() {
        return dataOfManufacture;
    }

    protected String getEngineFuel() {
        return engineFuel;
    }

    protected int getCubeCapacity() {
        return cubeCapacity;
    }

    protected String getTransmission() {
        return transmission;
    }

    protected double getMilleAge() {
        return milleAge;
    }

    protected String getColor() {
        return color;
    }

    protected int getPrice() {
        return price;
    }

    protected void setBrand(String brand) {
        this.brand = brand;
    }

    protected void setModel(String model) {
        this.model = model;
    }

    protected void setDataOfManufacture(int dataOfManufacture) {
        this.dataOfManufacture = dataOfManufacture;
    }

    protected void setMotorType(String engineFuel) {
        this.engineFuel = engineFuel;
    }

    protected void setCubeCapacity(int cubeCapacity) {
        this.cubeCapacity = cubeCapacity;
    }

    protected void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    protected void setMilleAge(long milleAge) {
        this.milleAge = milleAge;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected void setPrice(int price) {
        this.price = price;
    }
}
