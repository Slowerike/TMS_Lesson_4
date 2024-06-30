package by.tms.lesson4.task1;

public class CelsiusToReaumurConverter implements Converter {

    @Override
    public double convert(double degreesCelsius) {
        return degreesCelsius * 4 / 5;
    }
}
