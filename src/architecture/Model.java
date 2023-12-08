package architecture;

public class Model {
    private final ModelName name;
    private final BrandName brandName;

    public Model(ModelName name, BrandName brandName) {
        this.name = name;
        this.brandName = brandName;
    }

    public ModelName getName() {
        return name;
    }

    public BrandName getBrand() {
        return brandName;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name=" + name +
                '}';
    }
}
