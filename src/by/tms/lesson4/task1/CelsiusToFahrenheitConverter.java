package by.tms.lesson4.task1;

public class CelsiusToFahrenheitConverter implements Converter{

    @Override
    public double convert(double degreesCelsius) {
        return (degreesCelsius*9/5)+32;
    }
}
