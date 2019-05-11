import com.sda.encapsulation.Person;
import com.sda.inheritance.Car;
import com.sda.inheritance.Vehicle;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();

        person.setAge(18);
        System.out.println("Age: " + person.getAge());

        person.setAge(-18);
        System.out.println("Age: " + person.getAge());
        System.out.println("===========================");

        Vehicle vehicle = new Vehicle(220);
        //metoda este publica
        vehicle.setManufacturer("Dacia");
        /*
            proprietatea este protected:
                - nu am acces din alt pachet sau din clasa care nu
                extinde parintele
                - urmatoarea linie e comentata pt a compila fara erori
         */
//        vehicle.manufacturer = "Dacia";
        Car car = new Car(320, false);

        System.out.println(vehicle.toString());
        System.out.println(car.toString());

        Vehicle car2 = new Car(180, true);
        Vehicle vehicle2 = new Vehicle(2000);

        System.out.println(car2.toString());
        System.out.println(vehicle2.toString());
        System.out.println("==========================");

        print(car2);
        print(vehicle2);
    }

    public static void print(Vehicle input) {
        System.out.println("Received vehicle with:" +
                "\nmaxSpeed: " + input.getMaxSpeed() +
                "\nmanufacturer: " + input.getManufacturer());
    }
}
