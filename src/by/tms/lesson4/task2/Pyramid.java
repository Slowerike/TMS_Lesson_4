package by.tms.lesson4.task2;

public class Pyramid extends Shape {
    private double s;
    private double h;

    public Pyramid(double s, double h) {
        super(s * h / 3);
        this.s = s;
        this.h = h;
    }
}
