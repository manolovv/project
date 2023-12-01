import architecture.Car;
import architecture.Feature;
import architecture.Performance;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate carData = LocalDate.parse("1999-06-26");
        Car car = new Car(carData, 1789, 235.324, 4.650, 5, "Avant");
        car.addPerformanceCategories();
        car.setPerformanceValues(Performance.BRAND, "Audi");
        car.setPerformanceValues(Performance.MODEL, "A4");
        car.setPerformanceValues(Performance.FUEL, "Petrol");
        car.setPerformanceValues(Performance.TRANSMISSION, "Manual");
        car.setPerformanceValues(Performance.COLOR, "Grey");
        Feature abs = new Feature("abs");
        Feature trc = new Feature("traction control");
        Feature esp = new Feature("esp");
        car.setFeatures(abs);
        car.setFeatures(trc);
        car.setFeatures(esp);

        System.out.println(car);
    }
}