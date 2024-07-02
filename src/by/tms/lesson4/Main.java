package by.tms.lesson4;

import by.tms.lesson4.task1.BaseConverter;
import by.tms.lesson4.task1.CelsiusToFahrenheitConverter;
import by.tms.lesson4.task1.CelsiusToKelvinConverter;
import by.tms.lesson4.task1.CelsiusToReaumurConverter;
import by.tms.lesson4.task2.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("""
                Первая задача:
                """);
        int temperatureCelsius = 23;
        BaseConverter celsiusToFahrenheit = new BaseConverter(new CelsiusToFahrenheitConverter());
        System.out.println("Перевод температуры из градусов цельсия в Фаренгейт: " + celsiusToFahrenheit.convert(temperatureCelsius));
        BaseConverter celsiusToKelvin = new BaseConverter(new CelsiusToKelvinConverter());
        System.out.println("Перевод температуры из градусов цельсия в Кельвины: " + celsiusToKelvin.convert(temperatureCelsius));
        BaseConverter celsiusToReaumur = new BaseConverter(new CelsiusToReaumurConverter());
        System.out.println("Перевод температуры из градусов цельсия в Реомюра: " + celsiusToReaumur.convert(temperatureCelsius));

        System.out.println("""
                --------------------------------------------------------------------------------------------------------                
                Вторая задача:
                """);
        Box box = new Box(199);
        System.out.println(box+"\n");

        Ball ball = new Ball(3);
        System.out.println(ball);
        System.out.println("Можно добавить фигуру %s в коробку? - ".formatted(ball.getClass().getSimpleName()) +
                (box.add(ball) ? "Можно" : "Нельзя") + "\n");

        Cylinder cylinder = new Cylinder(2, 5);
        System.out.println(cylinder);
        System.out.println("Можно добавить фигуру %s в коробку? - ".formatted(cylinder.getClass().getSimpleName()) +
                (box.add(cylinder) ? "Можно" : "Нельзя") + "\n");

        Pyramid pyramid = new Pyramid(20, 30);
        System.out.println(pyramid);
        System.out.println("Можно добавить фигуру %s в коробку? - ".formatted(pyramid.getClass().getSimpleName()) +
                (box.add(pyramid) ? "Можно" : "Нельзя") + "\n");
    }
}