package designPatterns.strategyPattern.ducks;

import designPatterns.strategyPattern.flying.FlyingStrategy;
import designPatterns.strategyPattern.quacking.QuackingStrategy;

public class AdjustibleDuck extends Duck {
    public AdjustibleDuck(QuackingStrategy quackingStrategy, FlyingStrategy flyingStrategy) {
        this.quackingStrategy = quackingStrategy;
        this.flyingStrategy = flyingStrategy;
    }

    public void setQuackingStrategy(QuackingStrategy quackingStrategy) {
        this.quackingStrategy = quackingStrategy;
    }

    public void setFlyingStrategy(FlyingStrategy flyingStrategy) {
        this.flyingStrategy = flyingStrategy;
    }
}
