import architecture.*;

public class Main {
    public static void main(String[] args) {

        final Car audiA4 = new Car(DataHolder.getBrandByName(BrandName.AUDI), DataHolder.getModelByName(BrandName.AUDI, ModelName.AUDI_A4));
        final Car audiA6 = new Car(DataHolder.getBrandByName(BrandName.AUDI), DataHolder.getModelByName(BrandName.AUDI, ModelName.AUDI_A6));
        final Car audiA7 = new Car(DataHolder.getBrandByName(BrandName.AUDI), DataHolder.getModelByName(BrandName.AUDI, ModelName.AUDI_A7));
        final Car audiA8 = new Car(DataHolder.getBrandByName(BrandName.AUDI), DataHolder.getModelByName(BrandName.AUDI, ModelName.AUDI_A8));
        final Car audiS4 = new Car(DataHolder.getBrandByName(BrandName.AUDI), DataHolder.getModelByName(BrandName.AUDI, ModelName.AUDI_S4));
        final Car audiS5 = new Car(DataHolder.getBrandByName(BrandName.AUDI), DataHolder.getModelByName(BrandName.AUDI, ModelName.AUDI_S5));
        final Car audiS6 = new Car(DataHolder.getBrandByName(BrandName.AUDI), DataHolder.getModelByName(BrandName.AUDI, ModelName.AUDI_S6));
        final Car audiRS3 = new Car(DataHolder.getBrandByName(BrandName.AUDI), DataHolder.getModelByName(BrandName.AUDI, ModelName.AUDI_RS3));
        final Car audiRS4 = new Car(DataHolder.getBrandByName(BrandName.AUDI), DataHolder.getModelByName(BrandName.AUDI, ModelName.AUDI_RS4));
        final Car audiRS5 = new Car(DataHolder.getBrandByName(BrandName.AUDI), DataHolder.getModelByName(BrandName.AUDI, ModelName.AUDI_RS5));
        final Car audiQuattro = new Car(DataHolder.getBrandByName(BrandName.AUDI), DataHolder.getModelByName(BrandName.AUDI, ModelName.AUDI_QUATTRO));

        audiA4.addFeatures(DataHolder.getFeatureByName(FeatureName.ABS));
        audiA4.addFeatures(DataHolder.getFeatureByName(FeatureName.AIRBAGS));
        audiA4.addFeatures(DataHolder.getFeatureByName(FeatureName.DOORS_5));
        System.out.println(audiA4);
    }
}