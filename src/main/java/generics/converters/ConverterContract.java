package generics.converters;

public interface ConverterContract<FROM, TO> {

    TO convert(FROM value);
}
