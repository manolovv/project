package architecture;
import java.util.ArrayList;
import java.util.List;

public class Car {
    private final Brand brand;
    private final Model model;
    private final List<Feature> features;

    public Car(Brand brand, Model model) {
        this.brand = brand;
        this.model = model;
        this.features = new ArrayList<>();
    }

    public void addFeatures(Feature feature) {
        features.add(feature);
    }

    public Brand getBrand() {
        return brand;
    }

    public Model getModel() {
        return model;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", model=" + model +
                ", features=" + features +
                '}';
    }
}
