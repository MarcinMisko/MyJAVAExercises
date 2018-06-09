package designPatterns.decorator;

public abstract class WordDecorator implements Word {
    protected Word word;

    public WordDecorator(Word word) {
        this.word = word;
    }

}
