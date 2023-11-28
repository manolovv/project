package architecture;

public class Bus extends Vehicle {

    private int numberOfPlaces;
    private int loadCapacity;
    private int numberOfAxles;

    public Bus(String brand, String model,
        String engineFuel, String transmission, String color,
        int dataOfManufacture, int cubeCapacity, long milleAge, int price,
        int numberOfAxles, int numberOfPlaces, int loadCapacity) {

        super(brand, model,
                engineFuel, transmission, color,
                dataOfManufacture, cubeCapacity, milleAge, price);
        this.loadCapacity = loadCapacity;
        this.numberOfAxles = numberOfAxles;
        this.numberOfPlaces = numberOfPlaces;
    }
    public int getLoadCapacity() {
        return loadCapacity;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public int getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    public void setNumberOfPlaces(int numberOfPlaces) {
        this.numberOfPlaces = numberOfPlaces;
    }

    @Override
    public String toString() {
        return "\nHere is information about the architecture.Bus: " +
                "\nBrand: " + getBrand() +
                "\nModel: " + getModel() +
                "\nEngine fuel: " + getEngineFuel() +
                "\nTransmission: " + getTransmission() +
                "\nColor: " + getColor() +
                "\nData of manufacture: " + getDataOfManufacture() +
                "\nCube capacity: " + getCubeCapacity() +
                "\nMille age: " + getMilleAge() +
                "\nNumber of axles: " + getNumberOfAxles() +
                "\nNumber of places: " + getNumberOfPlaces() +
                "\nLoad capacity: " + getLoadCapacity() +
                "\nPrice: " + getPrice();

    }
}
