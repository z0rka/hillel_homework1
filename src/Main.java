import com.homework1.company.Employee;
import com.homework1.vehicle.Car;

public class Main {

    public static void main(String []args){

        Car car = new Car();
        Employee employee = new Employee("John","Manager","smth@gmail.com",481764891,42);

        System.out.println("Class car");
        car.start();

        System.out.println("Employee class");
        employee.printInfo();
    }
}
