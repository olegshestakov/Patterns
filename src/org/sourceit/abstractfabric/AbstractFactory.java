package org.sourceit.abstractfabric;

import org.sourceit.fabric.Shape;

public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);

}
