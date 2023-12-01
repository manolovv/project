package architecture;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class Vehicle {
    private final Map<Performance, String> performances;
    private final Set<Feature> features;
    private double cubeCapacity;
    private double milleAge;
    private double price;
    private LocalDate dataOfManufacture;

    protected Vehicle(LocalDate dataOfManufacture, double cubeCapacity, double milleAge, double price) {
        this.dataOfManufacture = dataOfManufacture;
        this.cubeCapacity = cubeCapacity;
        this.milleAge = milleAge;
        this.price = price;
        this.features = new HashSet<>();
        this.performances = new HashMap<>();
    }


    public void addPerformanceCategories() {
        for (Performance performance : Performance.values()) {
            this.performances.putIfAbsent(performance, null);
        }
    }

    public void setPerformanceValues(Performance key, String value) {
        this.performances.put(key, value);
    }

    public void setFeatures(Feature features) {
        this.features.add(features);
    }

    protected Set<Feature> getFeatures() {
        return features;
    }
    protected Map<Performance, String> getPerformances() {
        return performances;
    }
    public LocalDate getDataOfManufacture() {
        return dataOfManufacture;
    }

    protected double getCubeCapacity() {
        return cubeCapacity;
    }

    protected double getMilleAge() {
        return milleAge;
    }

    protected double getPrice() {
        return price;
    }
    public void setDataOfManufacture(LocalDate dataOfManufacture) { this.dataOfManufacture = dataOfManufacture; }
    protected void setCubeCapacity(double cubeCapacity) {
        this.cubeCapacity = cubeCapacity;
    }

    protected void setMilleAge(double milleAge) {
        this.milleAge = milleAge;
    }

    protected void setPrice(double price) {
        this.price = price;
    }
}
