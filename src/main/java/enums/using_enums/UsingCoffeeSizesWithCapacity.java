package enums.using_enums;


import enums.average.CoffeeSizesWithCapacity;

public class UsingCoffeeSizesWithCapacity {

    public static void main(String[] args) {
        CoffeeSizesWithCapacity smallCoffee = CoffeeSizesWithCapacity.SMALL;

        System.out.println("I've got coffee size " + smallCoffee);
        System.out.println("Its capacity is " + smallCoffee.getCapacityInMl());
    }
}
