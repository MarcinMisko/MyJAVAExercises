package designPatterns.strategyPattern.flying;

public class WingedFlying implements FlyingStrategy {
    @Override
    public String fly() {
        return "Flying using wings.";
    }
}
