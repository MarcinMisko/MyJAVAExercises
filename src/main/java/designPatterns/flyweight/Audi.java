package designPatterns.flyweight;

public class Audi extends Car {
    public Audi(int price) {
        super(price);
    }

    @Override
    int getCarPrice() {
        return 4500;
    }
}
