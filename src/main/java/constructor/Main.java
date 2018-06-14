package constructor;


import constructor.model.Car;
import constructor.model.RacingCar;
import constructor.model.Root;
import constructor.model.RootGrandson;

public class Main {

    public static void main(String[] args) {

        // check the output carefully
        Root root = new RootGrandson();

        Car car = new RacingCar();
    }
}
