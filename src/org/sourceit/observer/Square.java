package org.sourceit.observer;

public class Square extends OperationObserver {

    private double square;

    @Override
    public double valueChanged(Rectangle observed) {
        System.out.println("Inside square::valueChanged method");
        return square = observed.getHeight() * observed.getWidth();
    }

    @Override
    public String toString() {
        return "S = " + square;
    }
}
