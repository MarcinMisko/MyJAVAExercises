package strategy.ducks;

import designPatterns.strategyPattern.ducks.RubberDuck;
import org.junit.Assert;
import org.junit.Test;

public class RubberDuckTest {
    private RubberDuck rubberDuck = new RubberDuck();

    @Test
    public void shouldSqueakWhenPerformQuackCalled() {
        Assert.assertEquals("Squeak squeak!", rubberDuck.performQuack());
    }

    @Test
    public void shouldNotFlyWhenPerformFlightCalled() {
        Assert.assertEquals("Cannot fly.", rubberDuck.performFlight());
    }
}
