package by.tms.lesson4.task1;

public class BaseConverter {
    private Converter converter;

    public BaseConverter(Converter converter) {
        this.converter = converter;
    }

    public double convert(double temperature) {
        return converter.convert(temperature);
    }
}
