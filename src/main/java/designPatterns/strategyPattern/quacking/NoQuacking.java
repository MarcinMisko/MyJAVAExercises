package designPatterns.strategyPattern.quacking;

public class NoQuacking implements QuackingStrategy {
    @Override
    public String quack() {
        return "Cannot quack!";
    }
}
