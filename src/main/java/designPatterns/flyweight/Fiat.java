package designPatterns.flyweight;

public class Fiat extends Car {
    public Fiat(int price) {
        super(price);
    }

    @Override
    int getCarPrice() {
        return 2000;
    }
}
