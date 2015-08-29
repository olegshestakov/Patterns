package org.sourceit.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Rectangle {

    private double width;
    private double height;
    private List<OperationObserver> observers = new ArrayList<>();

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        notifyObservers();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        notifyObservers();
    }

    public void addListener(OperationObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers() {
        Iterator<OperationObserver> iterator = observers.iterator();

        while (iterator.hasNext()) {
            iterator.next().valueChanged(this);
        }
    }

    @Override
    public String toString() {
        String s = "";
        Iterator<OperationObserver> iterator = observers.iterator();
        while (iterator.hasNext()) {
            s  = s + iterator.next().toString() + "\n";
        }
        return s;
    }
}
