package designPatterns.flyweight;

public class Polonez extends Car {
    public Polonez(int price) {
        super(price);
    }

    @Override
    int getCarPrice() {
        return 2400;
    }
}
