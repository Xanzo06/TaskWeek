package org.example.taskweekchapter4;

abstract class Shape {
    Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public void movedBy(double dx, double dy){
        this.point.x += dx;
        this.point.y += dy;
    }
    public abstract Point getCenter();
}
