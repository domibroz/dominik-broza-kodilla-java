package com.kodilla.testing.shape;

public class Triangle implements Shape {
    Double a;
    Double h;

    public Triangle(Double a, Double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShapeName() {
        return "triangle";
    }

    @Override
    public Double getField() {
        return (a*h)/2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (a != null ? !a.equals(triangle.a) : triangle.a != null) return false;
        return h != null ? h.equals(triangle.h) : triangle.h == null;
    }

    @Override
    public int hashCode() {
        int result = a != null ? a.hashCode() : 0;
        result = 31 * result + (h != null ? h.hashCode() : 0);
        return result;
    }
}
