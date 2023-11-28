package architecture;

public class Car extends Vehicle {
    private int numberOfDoors;
    private String category;

    public Car(String brand, String model,
        String motorType, String transmission, String color,
        int dataOfManufacture, int cubeCapacity, long milleAge,
        int price, int numberOfDoors, String category) {

        super(brand, model,
                motorType, transmission, color,
                dataOfManufacture, cubeCapacity, milleAge, price);
        this.numberOfDoors = numberOfDoors;
        this.category = category;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public String getCategory() {
        return category;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "\nHere is information about the architecture.Car: " +
                "\nBrand: " + getBrand() +
                "\nModel: " + getModel() +
                "\narchitecture.Motor type: " + getEngineFuel() +
                "\nTransmission: " + getTransmission() +
                "\nColor: " + getColor() +
                "\nData of manufacture: " + getDataOfManufacture() +
                "\nCube capacity: " + getCubeCapacity() +
                "\nMille age: " + getMilleAge() +
                "\nNumber of doors: " + getNumberOfDoors() +
                "\nCategory: " + getCategory() +
                "\nPrice: " + getPrice();
    }
}
