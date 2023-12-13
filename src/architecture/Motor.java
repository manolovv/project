package architecture;

import java.time.LocalDate;
import java.util.List;

public class Motor extends Vehicle {
    private final MotorCategory motorCategory;

    public Motor(LocalDate dataOfManufacture, LocalDate firstRegister,
                 Brand brand, Model model, List<FeatureName> features,
                 Engine engine, TransmissionChoice transmission,
                 EuroStandard euroStandard, long milleAge, String color,
                 MotorCategory motorCategory) {
        super(dataOfManufacture, firstRegister, brand, model, features,
                engine, transmission, euroStandard, milleAge,
                color);
        this.motorCategory = motorCategory;
    }

    public MotorCategory getMotorCategory() {
        return motorCategory;
    }
}
