package exception.with_checked_exceptions;


import exception.my_exceptions.MyException;

public class MainWithExceptionHandling {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.addition(5, 3));
        System.out.println(calculator.subtraction(5, 3));
        System.out.println(calculator.multiplication(5, 3));

        try {
            System.out.println(calculator.division(5, 3));
            System.out.println(calculator.division(5, 0));
        } catch (MyException exception) {
            System.out.println("Exception occurred: " + exception);
        }
    }
}
