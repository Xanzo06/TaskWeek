package org.example.taskweekchapter4;

public class Rectangle extends Shape{
    private double width;
    private double height;


    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        double centerX = point.x + width / 2;
        double centerY = point.y + height / 2;
        return new Point(centerX, centerY);
    }
}
