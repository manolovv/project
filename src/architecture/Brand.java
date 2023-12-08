package architecture;
import java.util.HashSet;
import java.util.Set;

public class Brand {
    private final BrandName name;
    private final Set<Model> models;

    public Brand(BrandName name) {
        this.name = name;
        this.models = new HashSet<>();
    }

    public void addModel(Model model) {
        models.add(model);
    }

    public BrandName getName() {
        return name;
    }

    public Set<Model> getModels() {
        return models;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "name=" + name +
                '}';
    }

}
