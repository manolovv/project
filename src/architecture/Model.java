package architecture;

public class Model {
    private final ModelName name;
    private final Brand brand;

    public Model(ModelName name, Brand brandName) {
        this.name = name;
        this.brand = brandName;
    }

    public ModelName getName() {
        return name;
    }

    public Brand getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name=" + name +
                '}';
    }
}
