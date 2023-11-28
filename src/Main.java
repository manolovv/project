import architecture.Bus;
import architecture.Car;
import architecture.Motor;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Audi", "A4", "Gasoline",
                "Manual", "Grey", 1999, 1800,
                234560, 4200, 5, "Sedan");

        Bus bus = new Bus("Citroen", "Jumper", "Diesel",
                "Automation", "Blue", 2006, 2500,
                340200, 16000, 2, 8, 3000);

        Motor motor = new Motor("Citroen", "Jumper", "Diesel",
                "Automation", "Blue", 2006, 2500,
                340200, 16000, "Aerial", 4, "Cross");

        System.out.println(car);

        System.out.println(bus);

        System.out.println(motor);
    }
}