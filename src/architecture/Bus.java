package architecture;
import java.time.LocalDate;

public class Bus extends Vehicle {

    private int numberOfPlaces;
    private double loadCapacity;
    private int numberOfAxles;

    public Bus(LocalDate dataOfManufacture, int cubeCapacity, long milleAge, int price,
               int numberOfAxles, int numberOfPlaces, double loadCapacity) {

        super(dataOfManufacture, cubeCapacity, milleAge, price);
        this.loadCapacity = loadCapacity;
        this.numberOfAxles = numberOfAxles;
        this.numberOfPlaces = numberOfPlaces;
    }
    public double getLoadCapacity() {
        return loadCapacity;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public int getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public void setLoadCapacity(double loadCapacity) {
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
        return "Bus{" +
                "brand='" + getPerformances().get(Performance.BRAND) +
                ", model='" + getPerformances().get(Performance.MODEL) + '\'' +
                ", fuel='" + getPerformances().get(Performance.FUEL) + '\'' +
                ", transmission='" + getPerformances().get(Performance.TRANSMISSION) + '\'' +
                ", color='" + getPerformances().get(Performance.COLOR) + '\'' +
                ", production='" + getDataOfManufacture() + '\'' +
                ", places='" + getNumberOfPlaces() + '\'' +
                ", axles='" + getNumberOfAxles() + '\'' +
                ", load='" + getLoadCapacity() + '\'' +
                ", cubicCapacity='" + getCubeCapacity() + '\'' +
                ", milleage='" + getMilleAge() + '\'' +
                ", price='" + String.format("%.3f", getPrice()) + '\'' +
                ", features='" + getFeatures().toString() + '\'' +
                '}';
    }
}
