package org.example.taskweekchapter2;

/**
 * Неизменяемый класс, представляющий точку на плоскости
 * Все методы возвращают новые объекты, не изменяя начальные значения
 */
public class Point {
    private final double x;
    private final double y;

    /**
     * Конструктор создающий точку с заданными координатами
     * @param x ось x
     * @param y ось y
     */
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * Пустой конструктор который создает пустую точку в начале координат
     */
    public Point(){
        this(0.0, 0.0);
    }

    /**
     * Метод возвращающий координату x
     * @return возвращает значение поля x
     */
    public double getX(){
        return x;
    }

    /**
     * Метод возвращающий координату y
     * @return возвращает значение поля y
     */
    public double getY(){
        return y;
    }

    /**
     * Перемещает точку на заданное расстояние по осям X и Y.
     * Возвращает новую точку с новыми координатами.
     *
     * @param dx смещение по оси X
     * @param dy смещение по оси Y
     * @return новая точка, смещенная на (dx, dy)
     */
    public Point translate(double dx, double dy){
        return new Point(x + dx, y + dy);
    }

    /**
     * Масштабирует точку на заданный коэффициент.
     * Возвращает новую точку с координатами, умноженными на factor.
     *
     * @param f коэффициент масштабирования
     * @return новая точка, масштабированная на f
     */
    public Point scale(double f){
        return new Point(x * f, y * f);
    }

    /**
     * Метод преобразующий наши примитывы в строку для вывода
     * @return возвращает вывод
     */
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
