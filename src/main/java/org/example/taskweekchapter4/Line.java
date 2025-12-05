package org.example.taskweekchapter4;

public class Line extends Shape {
    private Point to;

    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }

    @Override
    public Point getCenter() {
        double centerX = (point.x + to.x) / 2;
        double centerY = (point.y + to.y) / 2;
        return new Point(centerX, centerY);
    }

    @Override
    public void movedBy(double dx, double dy) {
        super.movedBy(dx, dy);
        to.x += dx;
        to.y += dy;
    }
}
