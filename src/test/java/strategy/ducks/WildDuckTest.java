package strategy.ducks;

import designPatterns.strategyPattern.ducks.AdjustibleDuck;
import designPatterns.strategyPattern.flying.NoFlying;
import designPatterns.strategyPattern.flying.WingedFlying;
import designPatterns.strategyPattern.quacking.NoQuacking;
import designPatterns.strategyPattern.quacking.NormalQuacking;
import org.junit.Assert;
import org.junit.Test;


public class WildDuckTest {
    private AdjustibleDuck adjustibleDuck;

    @Test
    public void shouldQuackAndFlyWhenReceivedQuackingStrategyAndFlying() {
        adjustibleDuck = new AdjustibleDuck(new NormalQuacking(), new WingedFlying());
        Assert.assertEquals("Quack quack!", adjustibleDuck.performQuack());
        Assert.assertEquals("Flying using wings.", adjustibleDuck.performFlight());
    }

    @Test
    public void shouldBeAdjustible() {
        adjustibleDuck = new AdjustibleDuck(new NormalQuacking(), new WingedFlying());
        Assert.assertEquals("Quack quack!", adjustibleDuck.performQuack());
        Assert.assertEquals("Flying using wings.", adjustibleDuck.performFlight());

        adjustibleDuck.setFlyingStrategy(new NoFlying());
        adjustibleDuck.setQuackingStrategy(new NoQuacking());
        Assert.assertEquals("Cannot quack!", adjustibleDuck.performQuack());
        Assert.assertEquals("Cannot fly.", adjustibleDuck.performFlight());
    }
}
