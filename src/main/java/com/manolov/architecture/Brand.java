package com.manolov.architecture;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.*;


public class Brand {
    private final BrandName name;
    @JsonBackReference
    private final Set<Model> models;

    @JsonCreator
    public Brand(@JsonProperty("name") BrandName name) {
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
        return new HashSet<>(models);
    }

    @Override
    public String toString() {
        return "Brand{" +
                "name=" + name +
                '}';
    }
}
