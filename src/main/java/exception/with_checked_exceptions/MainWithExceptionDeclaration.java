package exception.with_checked_exceptions;


import exception.my_exceptions.MyException;

public class MainWithExceptionDeclaration {

    public static void main(String[] args) throws MyException {
        Calculator calculator = new Calculator();
        System.out.println(calculator.addition(5, 3));
        System.out.println(calculator.subtraction(5, 3));
        System.out.println(calculator.multiplication(5, 3));
        System.out.println(calculator.division(5, 3));
        System.out.println(calculator.division(5, 0));
    }
}
