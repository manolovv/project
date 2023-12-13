package architecture;

public class Model {
    private final ModelName name;
    private final Brand brandName;

    public Model(ModelName name, Brand brandName) {
        this.name = name;
        this.brandName = brandName;
    }

    public ModelName getName() {
        return name;
    }

    public Brand getBrand() {
        return brandName;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name=" + name +
                '}';
    }
}
