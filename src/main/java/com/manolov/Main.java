package com.manolov;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.manolov.architecture.*;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {


        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.findAndRegisterModules();

        List<Vehicle> vehicleListReader = objectMapper.readValue(new File("src\\main\\resources\\vehicles.json"),
                new TypeReference<>() {
                });

        System.out.println(vehicleListReader);


        LocalDate audiR8Manufacture = LocalDate.of(1999, Month.JANUARY, 6);
        LocalDate audiR8Register = LocalDate.of(2001, Month.FEBRUARY, 21);
        Brand audiR8Brand = DataHolder.getBrandByName(BrandName.AUDI);
        Model audiR8Model = DataHolder.getModelByName(BrandName.AUDI, ModelName.AUDI_R8);
        List<FeatureName> audiR8Features = List.of(FeatureName.ABS, FeatureName.TIRE_PRESSURE, FeatureName.AIRBAGS);
        Engine audiR8Engine = new Engine(EngineFuel.GASOLINE, TypeOfCooling.AIR_COOLING, 6, 3800, 506);

        Car audiR8 = new Car(audiR8Manufacture, audiR8Register, audiR8Brand, audiR8Model,
                audiR8Features, audiR8Engine, TransmissionChoice.SEMI_AUTOMATIC, EuroStandard.EURO_5,
                36000, Color.RED, 3, CarCategory.COUPE);


        LocalDate hondaCBRManufacture = LocalDate.of(1999, Month.JANUARY, 6);
        LocalDate hondaCBRRegister = LocalDate.of(2001, Month.FEBRUARY, 21);
        Brand hondaCBRBrand = DataHolder.getBrandByName(BrandName.MOTOR_HONDA);
        Model hondaCBRModel = DataHolder.getModelByName(BrandName.MOTOR_HONDA, ModelName.MOTOR_HONDA_CBR);
        List<FeatureName> hondaCBRFeatures = List.of(FeatureName.ABS, FeatureName.TIRE_PRESSURE);
        Engine hondaCBREngine = new Engine(EngineFuel.GASOLINE, TypeOfCooling.WATER_COOLING, 4, 600, 116);

        Motor hondaCBR = new Motor(hondaCBRManufacture, hondaCBRRegister, hondaCBRBrand, hondaCBRModel, hondaCBRFeatures,
                hondaCBREngine, TransmissionChoice.MANUAL, EuroStandard.EURO_4, 24000, Color.YELLOW, MotorCategory.ENDURO);


        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        objectMapper.setDateFormat(df);

        List<Vehicle> vehicleListWriter = new ArrayList<>();
        vehicleListWriter.add(audiR8);
        vehicleListWriter.add(hondaCBR);

        objectMapper.writeValue(new File("src\\main\\resources\\writeObjects.json"), vehicleListWriter);



        User manol = new User("Manol", "Manolov", Region.SMOLYAN,
                "mam96@abv.bg", "0878777666");
        BigDecimal price = new BigDecimal("6.600");
        Ad carAd = new Ad(audiR8, ProductStatus.USED, manol, price, null);
        Ad motorAd = new Ad(hondaCBR, ProductStatus.USED, manol, price, null);

        System.out.println("\n" + carAd);
        System.out.println("\n" + motorAd);


    }
}