import architecture.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LocalDate dataOfManufacture = LocalDate.of(1999, Month.JANUARY, 6);
        LocalDate firstRegister = LocalDate.of(2001, Month.FEBRUARY, 21);
        Brand carBrand = DataHolder.getBrandByName(BrandName.AUDI);
        Model carModel = DataHolder.getModelByName(BrandName.AUDI, ModelName.AUDI_R8);
        List<FeatureName> carFeatures = List.of(FeatureName.ABS, FeatureName.TIRE_PRESSURE, FeatureName.AIRBAGS);
        Engine carEngine = new Engine(EngineFuel.GASOLINE, TypeOfCooling.AIR_COOLING, 6, 3800, 506);

        Car car = new Car(dataOfManufacture, firstRegister, carBrand, carModel,
                carFeatures, carEngine, TransmissionChoice.SEMI_AUTOMATIC, EuroStandard.EURO_5,
                36000, "Red", 3, CarCategory.COUPE);

        System.out.println(car);

        LocalDate motorManufacture = LocalDate.of(1999, Month.JANUARY, 6);
        LocalDate motorRegister = LocalDate.of(2001, Month.FEBRUARY, 21);
        Brand motorBrand = DataHolder.getBrandByName(BrandName.MOTOR_APRILIA);
        Model motorModel = DataHolder.getModelByName(BrandName.MOTOR_APRILIA, ModelName.MOTOR_APRILIA_AF);
        List<FeatureName> motorFeatures = List.of(FeatureName.ABS, FeatureName.TIRE_PRESSURE);
        Engine motorEngine = new Engine(EngineFuel.GASOLINE, TypeOfCooling.WATER_COOLING, 4, 600, 116);

        Motor motor = new Motor(motorManufacture, motorRegister, motorBrand, motorModel, motorFeatures,
                motorEngine, TransmissionChoice.MANUAL, EuroStandard.EURO_4, 24000, "Yellow", MotorCategory.ENDURO);

        System.out.println(motor);
    }
}