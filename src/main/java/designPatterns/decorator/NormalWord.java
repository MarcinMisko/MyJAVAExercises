package designPatterns.decorator;

public class NormalWord implements Word {
    @Override
    public String display() {
        return "fish";
    }
}
