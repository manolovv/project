package architecture;
import java.time.LocalDate;

public class Car extends Vehicle {
    private int numberOfDoors;
    private String category;


    public Car(LocalDate dataOfManufacture, int cubeCapacity, double milleAge,
               double price, int numberOfDoors, String category) {

        super(dataOfManufacture, cubeCapacity, milleAge, price);
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
        return "Car{" +
                "brand='" + getPerformances().get(Performance.BRAND) +
                ", model='" + getPerformances().get(Performance.MODEL) + '\'' +
                ", fuel='" + getPerformances().get(Performance.FUEL) + '\'' +
                ", transmission='" + getPerformances().get(Performance.TRANSMISSION) + '\'' +
                ", color='" + getPerformances().get(Performance.COLOR) + '\'' +
                ", production='" + getDataOfManufacture() + '\'' +
                ", category='" + getCategory() + '\'' +
                ", cubicCapacity='" + getCubeCapacity() + '\'' +
                ", milleage='" + getMilleAge() + '\'' +
                ", price='" + String.format("%.3f", getPrice()) + '\'' +
                ", features='" + getFeatures().toString() + '\'' +
                '}';
    }
}
