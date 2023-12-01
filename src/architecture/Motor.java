package architecture;
import java.time.LocalDate;

public class Motor extends Vehicle {
    private String engineType;
    private String typeOfCooling;
    private String category;

    public Motor(LocalDate dataOfManufacture, double cubeCapacity, long milleAge,
                 int price, String typeOfCooling, String engineType, String category) {

        super(dataOfManufacture, cubeCapacity, milleAge, price);
        this.engineType = engineType;
        this.typeOfCooling = typeOfCooling;
        this.category = category;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getTypeOfCooling() {
        return typeOfCooling;
    }

    public String getCategory() {
        return category;
    }

    public void setEngineType(String engineType) {
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
        return "Motor{" +
                "brand='" + getPerformances().get(Performance.BRAND) +
                ", model='" + getPerformances().get(Performance.MODEL) + '\'' +
                ", fuel='" + getPerformances().get(Performance.FUEL) + '\'' +
                ", transmission='" + getPerformances().get(Performance.TRANSMISSION) + '\'' +
                ", color='" + getPerformances().get(Performance.COLOR) + '\'' +
                ", production='" + getDataOfManufacture() + '\'' +
                ", category='" + getCategory() + '\'' +
                ", cubicCapacity='" + getCubeCapacity() + '\'' +
                ", milleage='" + getMilleAge() + '\'' +
                ", enginType='" + getEngineType() + '\'' +
                ", coolingType='" + getTypeOfCooling() + '\'' +
                ", price='" + String.format("%.3f", getPrice()) + '\'' +
                ", features='" + getFeatures().toString() + '\'' +
                '}';
    }
}

