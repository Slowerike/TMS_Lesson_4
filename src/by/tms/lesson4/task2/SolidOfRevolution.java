package by.tms.lesson4.task2;

public class SolidOfRevolution extends Shape {
    private double radius;

    public SolidOfRevolution(double radius, double volume) {
        super(volume);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
