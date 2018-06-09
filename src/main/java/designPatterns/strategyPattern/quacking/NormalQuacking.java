package designPatterns.strategyPattern.quacking;

public class NormalQuacking implements QuackingStrategy {
    @Override
    public String quack() {
        return "Quack quack!";
    }
}
