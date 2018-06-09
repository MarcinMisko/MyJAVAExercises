package designPatterns.strategyPattern.quacking;

public class SqueakyQuacking implements QuackingStrategy {
    @Override
    public String quack() {
        return "Squeak squeak!";
    }
}
