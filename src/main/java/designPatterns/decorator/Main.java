package designPatterns.decorator;

public class Main {
    public static void main(String[] args) {
        Word word = new UnPrefix(new IngSuffix(new NormalWord()));
        System.out.println(word.display());
    }
}
