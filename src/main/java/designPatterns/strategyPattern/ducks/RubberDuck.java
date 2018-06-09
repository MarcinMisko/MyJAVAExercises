package designPatterns.strategyPattern.ducks;

import designPatterns.strategyPattern.flying.NoFlying;
import designPatterns.strategyPattern.quacking.SqueakyQuacking;

public class RubberDuck extends Duck {
    public RubberDuck() {
        this.quackingStrategy = new SqueakyQuacking();
        this.flyingStrategy = new NoFlying();
    }
}
