package java8.lambda;

public class Job implements Runnable {
    @Override
    public void run() {
        System.out.println("Job");
    }
}
