package designPatterns.strategyPattern.ducks;

import designPatterns.strategyPattern.flying.NoFlying;
import designPatterns.strategyPattern.quacking.NoQuacking;

public class ModelDuck extends Duck {
    public ModelDuck() {
        this.quackingStrategy = new NoQuacking();
        this.flyingStrategy = new NoFlying();
    }
}
