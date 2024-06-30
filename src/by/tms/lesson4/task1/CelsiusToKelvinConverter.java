package by.tms.lesson4.task1;

public class CelsiusToKelvinConverter implements Converter{

    @Override
    public double convert(double degreesCelsius) {
        return degreesCelsius+273.15;
    }
}
