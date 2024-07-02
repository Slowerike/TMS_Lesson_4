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
                                
                Вторая задача:
                """);
        Box box = new Box(199);
        System.out.println(box);

        Ball ball = new Ball(3);
        System.out.println(ball);
        System.out.println("Можно добавить фигуру %s,да/нет? - ".formatted(ball.getClass().getSimpleName()) +
                (box.add(ball) ? "да" : "нет") + "\n");

        Cylinder cylinder = new Cylinder(2, 5);
        System.out.println(cylinder);
        System.out.println("Можно добавить фигуру %s,да/нет? - ".formatted(cylinder.getClass().getSimpleName()) +
                (box.add(cylinder) ? "да" : "нет") + "\n");

        Pyramid pyramid = new Pyramid(20, 30);
        System.out.println(pyramid);
        System.out.println("Можно добавить фигуру %s,да/нет? - ".formatted(pyramid.getClass().getSimpleName()) +
                (box.add(pyramid) ? "да" : "нет") + "\n");
    }
}