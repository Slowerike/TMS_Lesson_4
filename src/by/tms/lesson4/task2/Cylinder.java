package by.tms.lesson4.task2;

public class Cylinder extends SolidOfRevolution {
    private double height;


    public Cylinder(double radius, double height) {
        super(radius, Math.PI * Math.pow(radius, 2) * height);
        this.height = height;

    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Цилиндр [" +
                "Высота-" + getHeight() +
                ",Объём-" + (int) this.getVolume() +
                ']';
    }
}
