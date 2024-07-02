package by.tms.lesson4.task2;

public class Box extends Shape {

    public Box(double volume) {
        super(volume);
    }

    public boolean add(Shape shape) {
        return this.getVolume() >= shape.getVolume();
    }

    @Override
    public String toString() {
        return "Коробка [Объём-" + (int) this.getVolume() + "]";
    }

}
