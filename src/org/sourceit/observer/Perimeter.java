package org.sourceit.observer;

public class Perimeter extends OperationObserver {

    private double perimeter;

    @Override
    public double valueChanged(Rectangle observed) {
        System.out.println("Inside perimeter::valueChanged method");
        return perimeter = 2 * (observed.getWidth() + observed.getHeight());
    }

    @Override
    public String toString() {
        return "P = " + perimeter;
    }
}
