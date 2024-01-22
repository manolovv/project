package com.manolov.architecture;
import java.util.*;

public final class DataHolder {
    private final static Map<BrandName, Brand> brands = new HashMap<>();
    private final static Map<ModelName, Model> models = new HashMap<>();

    static {
        brands.put(BrandName.AUDI, new Brand(BrandName.AUDI));
        models.put(ModelName.AUDI_R8, new Model(ModelName.AUDI_R8, getBrandByName(BrandName.AUDI)));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_R8));

        brands.put(BrandName.MOTOR_HONDA, new Brand(BrandName.MOTOR_HONDA));
        models.put(ModelName.MOTOR_HONDA_CBR, new Model(ModelName.MOTOR_HONDA_CBR, getBrandByName(BrandName.MOTOR_HONDA)));
        brands.get(BrandName.MOTOR_HONDA).addModel(getModelByName(BrandName.MOTOR_HONDA, ModelName.MOTOR_HONDA_CBR));

    }

    public static Model getModelByName(BrandName brandName, ModelName modelName) {
        return models.values()
                .stream()
                .filter(model -> model.getBrand().getName().name().equals(brandName.name()) && model.getName().equals(modelName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("This model is not part of brand"));
    }

    public static Brand getBrandByName(BrandName brandName) {
        return brands.get(brandName);
    }
}
