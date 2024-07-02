package by.tms.lesson4.task2;

public class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        super(radius, (4.0 / 3.0) * Math.PI * Math.pow(radius, 3));
    }

    @Override
    public String toString() {
        return "Шар{Радиус-" + this.getRadius() + ",Объём-" + (int) this.getVolume() + "}";
    }
}
