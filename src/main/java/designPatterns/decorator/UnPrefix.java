package designPatterns.decorator;

public class UnPrefix extends WordDecorator {
    @Override
    public String display() {
        return "UN" + word.display();
    }

    public UnPrefix(Word word) {
        super(word);
    }
}
