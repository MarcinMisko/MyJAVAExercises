package designPatterns.strategyPattern.flying;

public class NoFlying implements FlyingStrategy {
    @Override
    public String fly() {
        return "Cannot fly.";
    }
}
