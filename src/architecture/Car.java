package architecture;
import java.time.LocalDate;
import java.util.List;

public class Car extends Vehicle {

    private final int numberOfDoors;
    private final CarCategory carCategory;

    public Car(LocalDate dataOfManufacture, LocalDate firstRegister,
               Brand brand, Model model, List<FeatureName> features,
               Engine engine, TransmissionChoice transmission,
               EuroStandard euroStandard, long milleAge, Color color,
               int numberOfDoors, CarCategory carCategory) {
        super(dataOfManufacture, firstRegister, brand, model, features, engine,
                transmission, euroStandard, milleAge, color);
        this.numberOfDoors = numberOfDoors;
        this.carCategory = carCategory;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public CarCategory getCarCategory() {
        return carCategory;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + getNumberOfDoors() +
                ", carCategory=" + getCarCategory() +
                "} " + super.toString();
    }
}
