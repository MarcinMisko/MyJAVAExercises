package constructor.model;

public class Root {

    static {
        System.out.println("Static block in Root");
    }

    {
        System.out.println("Root's init block");
    }

    public Root() {
        System.out.println("Root's constructor");
    }
}
