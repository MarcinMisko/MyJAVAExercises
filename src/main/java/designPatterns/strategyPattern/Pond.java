package designPatterns.strategyPattern;

import designPatterns.strategyPattern.ducks.AdjustibleDuck;
import designPatterns.strategyPattern.ducks.Duck;
import designPatterns.strategyPattern.ducks.WildDuck;
import designPatterns.strategyPattern.flying.RocketEngineFlying;
import designPatterns.strategyPattern.quacking.SqueakyQuacking;

import java.util.ArrayList;
import java.util.List;

public class Pond {
    private List<Duck> ducks = new ArrayList<>();

    public void action() {
        ducks.forEach(duck -> {
            System.out.println(duck.getDisplayInfo());
            System.out.println(duck.swim());
            System.out.println(duck.performQuack());
            System.out.println(duck.performFlight());
            System.out.println();
        });
    }

    public void addDuck(Duck duck) {
        ducks.add(duck);
    }

    public static void main(String[] args) {
        Pond pond = new Pond();
        WildDuck wildDuck = new WildDuck();
        pond.addDuck(wildDuck);
        AdjustibleDuck adjustibleDuck = new AdjustibleDuck(new SqueakyQuacking(), new RocketEngineFlying());
        pond.addDuck(adjustibleDuck);
        pond.action();
    }
}
