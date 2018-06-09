package designPatterns.strategyPattern.ducks;

import designPatterns.strategyPattern.quacking.NormalQuacking;
import designPatterns.strategyPattern.flying.RocketEngineFlying;

public class RocketDuck extends Duck {
    public RocketDuck() {
        this.quackingStrategy = new NormalQuacking();
        this.flyingStrategy = new RocketEngineFlying();
    }
}
