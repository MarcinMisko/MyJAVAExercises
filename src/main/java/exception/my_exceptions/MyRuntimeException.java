package exception.my_exceptions;

public class MyRuntimeException extends RuntimeException {

    public MyRuntimeException() {
        super();
    }

    public MyRuntimeException(String message) {
        super(message);
    }


}
