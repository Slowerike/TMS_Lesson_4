package by.tms.lesson4.task2;

public class Box {
    private double volume;
    public Shape[] shapes;
    private int shapeCount = 0;

    public Box(double volume) {
        super();
        this.volume = volume;
    }

    public boolean add(Shape shape) {
        shapes = new Shape[shapeCount + 1];
        if (volume >= shape.getVolume()) {
            shapes[shapeCount] = shape;
            shapeCount++;
            volume += shape.getVolume();
            return true;

        }
        return false;
    }
}
