package taskweekchapter2;

/**
 * Изменяемый класс который хранит значения координат
 * Все методы изменяют значения полей
 */
public class Point2 {
    private double x;
    private double y;

    /**
     * Конструктор задающий точку заданным координатам
     * @param x ось
     * @param y ось
     */
    public Point2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Метод возвращающий координату x
     * @return возвращает значение поля x
     */
    public double getX() {
        return x;
    }
    /**
     * Метод возвращающий координату y
     * @return возвращает значение поля y
     */
    public double getY() {
        return y;
    }

    /**
     * Метод задающий новое значение для координат x и y
     * @param dx смещение по оси x
     * @param dy смещение по оси y
     */
    public void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    /**
     * Масштабирует точку на заданный коэффициент.
     * Возвращает новую точку с координатами, умноженными на factor.
     *
     * @param f коэффициент масштабирования
     */
    public void scale(double f) {
        this.x *= f;
        this.y *= f;
    }
    /**
     * Метод преобразующий наши примитывы в строку для вывода
     * @return возвращает вывод
     */
    public String toString() {
        return "(" + x + "," + y + ")";

    }
}
