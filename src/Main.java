import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //OOP
        //object => Entity that holds data(attributes)
        //And can perform actions (methods)
        // It is a reference data type

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Car car = new Car();
        System.out.println(car.model);

        car.start();
        car.stop();
        car.drive();
        car.brake();
    }
}
