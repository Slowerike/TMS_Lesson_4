package by.tms.lesson4.task2;

public class Pyramid extends Shape {
    private double s;
    private double h;

    public Pyramid(double s, double h) {
        super(s * h / 3);
        this.s = s;
        this.h = h;
    }

    @Override
    public String toString() {
        return "Пирамида [" +
                "Площадь-" + getS() +
                ",Высота-" + getH() +
                ",Объём-" + (int) this.getVolume() +
                ']';
    }

    public double getS() {
        return s;
    }

    public double getH() {
        return h;
    }
}
