package designPatterns.singleton;

public class AppSettings {
    private static volatile AppSettings instance;

    private AppSettings() {
    }

    public static AppSettings getInstance(){
        if (instance != null){
            return instance;
        }
            synchronized (Object.class){
                instance = new AppSettings();
        }
        return instance;
    }
}
