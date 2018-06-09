package designPatterns.strategyPattern.ducks;

import designPatterns.strategyPattern.quacking.NormalQuacking;
import designPatterns.strategyPattern.flying.WingedFlying;

public class WildDuck extends Duck {
    public WildDuck() {
        this.quackingStrategy = new NormalQuacking();
        this.flyingStrategy = new WingedFlying();
    }
}
