package designPatterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public abstract class Car {
    private int price;
    private List<CarCustomization> carCustomizationList = new ArrayList<>();

    public Car(int price) {
        this.price = price;
    }

    void addCustomization(CarCustomization carCustomization){
        carCustomizationList.add(carCustomization);
    }
    public int calculatePrice(){
        return price + carCustomizationList.stream()
                .mapToInt(CarCustomization::getPrice)
                .sum();
//                ALTERNATYWNIE
//                .map(elem -> elem.getPrice())
//                .reduce(0, (el1, el2) -> el1 + el2);
    }

    abstract int getCarPrice();
}
