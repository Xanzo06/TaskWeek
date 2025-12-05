package org.example.taskweekchapter4;

import java.util.Objects;

public class LabeledPoint extends Point {
    String label;

    public void someMethod() {
        x = 15;
        y = 20;
    }


    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
@Override
    public String toString() {
        return getClass().getName() + "[x= " + getX() + " , y= " + getY() + ", label= " + getLabel() + "]";
    }
@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof LabeledPoint)) return false;
        if (!super.equals(obj)) return false;
        LabeledPoint other = (LabeledPoint) obj;
        return Objects.equals(this.label, other.label);
    }
@Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), label);
    }
}
