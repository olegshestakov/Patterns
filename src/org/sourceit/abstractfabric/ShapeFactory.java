package org.sourceit.abstractfabric;

import org.sourceit.fabric.Circle;
import org.sourceit.fabric.Rectangle;
import org.sourceit.fabric.Shape;
import org.sourceit.fabric.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
