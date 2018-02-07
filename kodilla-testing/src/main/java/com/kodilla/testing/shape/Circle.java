package com.kodilla.testing.shape;

public class Circle implements Shape {
    Double r;

    public Circle(Double r) {
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return "circle";
    }

    @Override
    public Double getField() {
        return 2*r*3.14;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return r != null ? r.equals(circle.r) : circle.r == null;
    }

    @Override
    public int hashCode() {
        return r != null ? r.hashCode() : 0;
    }
}
