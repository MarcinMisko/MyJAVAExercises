package designPatterns.strategyPattern.ducks;

import designPatterns.strategyPattern.flying.FlyingStrategy;
import designPatterns.strategyPattern.quacking.QuackingStrategy;

public abstract class Duck {
    QuackingStrategy quackingStrategy;
    FlyingStrategy flyingStrategy;

    public String swim() {
        return "I am swimming.";
    }

    public String getDisplayInfo() {
        String classNameWithPackage = this.getClass().toString();
        String className = classNameWithPackage.substring(classNameWithPackage.lastIndexOf(".") + 1);
        return "I am " + className;
    }

    public String performQuack() {
        return quackingStrategy.quack();
    }

    public String performFlight() {
        return flyingStrategy.fly();
    }
}
