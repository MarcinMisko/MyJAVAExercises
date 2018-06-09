package designPatterns.decorator;

public class IngSuffix extends WordDecorator {
    @Override
    public String display() {
        return word.display() + "ING";
    }

    public IngSuffix(Word word) {
        super(word);
    }
}
