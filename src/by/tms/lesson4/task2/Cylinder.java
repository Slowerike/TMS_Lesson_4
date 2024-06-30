package by.tms.lesson4.task2;

public class Cylinder extends SolidOfRevolution {
    public double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
        volume = Math.PI * Math.pow(radius, 2) * height;
    }

}
