package architecture;
import java.util.*;

public final class DataHolder {
    private final static Map<BrandName, Brand> brands = new HashMap<>();
    private final static Map<ModelName, Model> models = new HashMap<>();
    private final static Map<FeatureName, Feature> features = new HashMap<>();

    static {
        brands.put(BrandName.ACURA, new Brand(BrandName.ACURA));
        brands.put(BrandName.AUDI, new Brand(BrandName.AUDI));
        brands.put(BrandName.ALFAROMEO, new Brand(BrandName.ALFAROMEO));
        brands.put(BrandName.ASTONMARTIN, new Brand(BrandName.ASTONMARTIN));

        brands.put(BrandName.BMW, new Brand(BrandName.BMW));
        brands.put(BrandName.BENTLEY, new Brand(BrandName.BENTLEY));
        brands.put(BrandName.BUGATTI, new Brand(BrandName.BUGATTI));

        brands.put(BrandName.CADILLAC, new Brand(BrandName.CADILLAC));
        brands.put(BrandName.CHEVROLET, new Brand(BrandName.CHEVROLET));
        brands.put(BrandName.CHRYSLER, new Brand(BrandName.CHRYSLER));
        brands.put(BrandName.CITROEN, new Brand(BrandName.CITROEN));
        brands.put(BrandName.CORVETTE, new Brand(BrandName.CORVETTE));

        brands.put(BrandName.DACIA, new Brand(BrandName.DACIA));
        brands.put(BrandName.DAEWOO, new Brand(BrandName.DAEWOO));
        brands.put(BrandName.DAIHATSU, new Brand(BrandName.DAIHATSU));
        brands.put(BrandName.DATSU, new Brand(BrandName.DATSU));
        brands.put(BrandName.DODGE, new Brand(BrandName.DODGE));

        brands.put(BrandName.EAGLE, new Brand(BrandName.EAGLE));

        brands.put(BrandName.FERRARI, new Brand(BrandName.FERRARI));
        brands.put(BrandName.FIAT, new Brand(BrandName.FIAT));
        brands.put(BrandName.FORD, new Brand(BrandName.FORD));

        brands.put(BrandName.GREATWALL, new Brand(BrandName.GREATWALL));

        brands.put(BrandName.HEINKEL, new Brand(BrandName.HEINKEL));
        brands.put(BrandName.HONDA, new Brand(BrandName.HONDA));
        brands.put(BrandName.HYUNDAI, new Brand(BrandName.HYUNDAI));

        brands.put(BrandName.INFINITI, new Brand(BrandName.INFINITI));
        brands.put(BrandName.ISUZU, new Brand(BrandName.ISUZU));

        brands.put(BrandName.JAGUAR, new Brand(BrandName.JAGUAR));

        brands.put(BrandName.KIA, new Brand(BrandName.KIA));

        brands.put(BrandName.LADA, new Brand(BrandName.LADA));
        brands.put(BrandName.LAMBORGHINI, new Brand(BrandName.JAGUAR));
        brands.put(BrandName.LANCIA, new Brand(BrandName.LANCIA));
        brands.put(BrandName.LEXUS, new Brand(BrandName.LEXUS));
        brands.put(BrandName.LINCOLN, new Brand(BrandName.LINCOLN));
        brands.put(BrandName.LOTUS, new Brand(BrandName.LOTUS));

        brands.put(BrandName.MERCEDES, new Brand(BrandName.MERCEDES));
        brands.put(BrandName.MASERATI, new Brand(BrandName.MASERATI));
        brands.put(BrandName.MAYBACH, new Brand(BrandName.MAYBACH));
        brands.put(BrandName.MAZDA, new Brand(BrandName.MAZDA));
        brands.put(BrandName.MCLAREN, new Brand(BrandName.MCLAREN));
        brands.put(BrandName.MINI, new Brand(BrandName.MINI));
        brands.put(BrandName.MITSUBISHI, new Brand(BrandName.MITSUBISHI));

        brands.put(BrandName.NISSAN, new Brand(BrandName.NISSAN));

        brands.put(BrandName.OPEL, new Brand(BrandName.OPEL));

        brands.put(BrandName.PEUGEOT, new Brand(BrandName.PEUGEOT));
        brands.put(BrandName.PORSCHE, new Brand(BrandName.PORSCHE));

        brands.put(BrandName.RENAULT, new Brand(BrandName.RENAULT));
        brands.put(BrandName.ROLLSROYCE, new Brand(BrandName.ROLLSROYCE));
        brands.put(BrandName.ROVER, new Brand(BrandName.ROVER));

        brands.put(BrandName.SUBARU, new Brand(BrandName.SUBARU));
        brands.put(BrandName.SEAT, new Brand(BrandName.SEAT));
        brands.put(BrandName.SAAB, new Brand(BrandName.SAAB));
        brands.put(BrandName.SKODA, new Brand(BrandName.SKODA));
        brands.put(BrandName.SMART, new Brand(BrandName.SMART));
        brands.put(BrandName.SSANGYONG, new Brand(BrandName.SSANGYONG));
        brands.put(BrandName.SUZUKI, new Brand(BrandName.SUZUKI));

        brands.put(BrandName.TESLA, new Brand(BrandName.TESLA));
        brands.put(BrandName.TOYOTA, new Brand(BrandName.TOYOTA));
        brands.put(BrandName.TRABANT, new Brand(BrandName.TRABANT));

        brands.put(BrandName.VOLGA, new Brand(BrandName.VOLGA));
        brands.put(BrandName.VOLKSWAGEN, new Brand(BrandName.VOLKSWAGEN));
        brands.put(BrandName.VOLVO, new Brand(BrandName.VOLVO));


        models.put(ModelName.AUDI_A4, new Model(ModelName.AUDI_A4, BrandName.AUDI));
        models.put(ModelName.AUDI_A6, new Model(ModelName.AUDI_A6, BrandName.AUDI));
        models.put(ModelName.AUDI_A7, new Model(ModelName.AUDI_A7, BrandName.AUDI));
        models.put(ModelName.AUDI_A8, new Model(ModelName.AUDI_A8, BrandName.AUDI));
        models.put(ModelName.AUDI_S4, new Model(ModelName.AUDI_S4, BrandName.AUDI));
        models.put(ModelName.AUDI_S5, new Model(ModelName.AUDI_S5, BrandName.AUDI));
        models.put(ModelName.AUDI_S6, new Model(ModelName.AUDI_S6, BrandName.AUDI));
        models.put(ModelName.AUDI_RS4, new Model(ModelName.AUDI_RS4, BrandName.AUDI));
        models.put(ModelName.AUDI_RS5, new Model(ModelName.AUDI_RS5, BrandName.AUDI));
        models.put(ModelName.AUDI_RS3, new Model(ModelName.AUDI_RS3, BrandName.AUDI));
        models.put(ModelName.AUDI_QUATTRO, new Model(ModelName.AUDI_QUATTRO, BrandName.AUDI));

        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_A4));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_A6));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_A7));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_A8));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_S4));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_S5));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_S6));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_RS3));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_RS4));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_RS5));
        brands.get(BrandName.AUDI).addModel(getModelByName(BrandName.AUDI, ModelName.AUDI_QUATTRO));

        features.put(FeatureName.ABS, new Feature(FeatureName.ABS));
        features.put(FeatureName.AIRBAGS, new Feature(FeatureName.AIRBAGS));
        features.put(FeatureName.GPS, new Feature(FeatureName.GPS));
        features.put(FeatureName.TRACK_CONTROL, new Feature(FeatureName.TRACK_CONTROL));
        features.put(FeatureName.ADDAPT_LIGHTS, new Feature(FeatureName.ADDAPT_LIGHTS));
        features.put(FeatureName.ESP, new Feature(FeatureName.ESP));
        features.put(FeatureName.TIRE_PRESSURE, new Feature(FeatureName.TIRE_PRESSURE));
        features.put(FeatureName.PARKTRONIC, new Feature(FeatureName.PARKTRONIC));
        features.put(FeatureName.ISO_FIX, new Feature(FeatureName.ISO_FIX));
        features.put(FeatureName.DSA, new Feature(FeatureName.DSA));
        features.put(FeatureName.APS, new Feature(FeatureName.APS));
        features.put(FeatureName.TCS, new Feature(FeatureName.TCS));
        features.put(FeatureName.DBS, new Feature(FeatureName.DBS));
        features.put(FeatureName.DISTRONIC, new Feature(FeatureName.DISTRONIC));
        features.put(FeatureName.DSC, new Feature(FeatureName.DSC));
        features.put(FeatureName.BRAKE_ASSIST, new Feature(FeatureName.BRAKE_ASSIST));
        features.put(FeatureName.AUTO_START_STOP, new Feature(FeatureName.AUTO_START_STOP));
        features.put(FeatureName.BLUETOOTH, new Feature(FeatureName.BLUETOOTH));
        features.put(FeatureName.DVD_TV, new Feature(FeatureName.DVD_TV));
        features.put(FeatureName.STEPTRONIC_TIPTRONIC, new Feature(FeatureName.STEPTRONIC_TIPTRONIC));
        features.put(FeatureName.AIRMATIC, new Feature(FeatureName.AIRMATIC));
        features.put(FeatureName.KEYLESS, new Feature(FeatureName.KEYLESS));
        features.put(FeatureName.DIFF_LOCK, new Feature(FeatureName.DIFF_LOCK));
        features.put(FeatureName.BORD_COMPUTER, new Feature(FeatureName.BORD_COMPUTER));
        features.put(FeatureName.EPS, new Feature(FeatureName.EPS));
        features.put(FeatureName.CLIMATRONIC, new Feature(FeatureName.CLIMATRONIC));
        features.put(FeatureName.NAVIGATION, new Feature(FeatureName.NAVIGATION));
        features.put(FeatureName.CRUISE_CONTROL, new Feature(FeatureName.CRUISE_CONTROL));
        features.put(FeatureName.RAIN_SENSOR, new Feature(FeatureName.RAIN_SENSOR));
        features.put(FeatureName.MOTION_4X4, new Feature(FeatureName.MOTION_4X4));
        features.put(FeatureName.REAR_DRIVE, new Feature(FeatureName.REAR_DRIVE));
        features.put(FeatureName.FRONT_DRIVE, new Feature(FeatureName.FRONT_DRIVE));
        features.put(FeatureName.DOORS_3, new Feature(FeatureName.DOORS_3));
        features.put(FeatureName.DOORS_5, new Feature(FeatureName.DOORS_5));

    }
    public static Model getModelByName(BrandName brandName, ModelName modelName) {
        return models.values()
                .stream()
                .filter(model -> model.getBrand().name().equals(brandName.name()) && model.getName().equals(modelName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("This model is not part of brand"));
    }

    public static Brand getBrandByName(BrandName brandName) {
        return brands.get(brandName);
    }

    public static Feature getFeatureByName(FeatureName featureName) {
        return features.get(featureName);
    }
}
