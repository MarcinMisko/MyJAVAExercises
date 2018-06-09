package generics.validators;


public interface Validator<T extends Number> {

    boolean validate(T value);

}

