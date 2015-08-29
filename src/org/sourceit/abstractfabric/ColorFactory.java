package org.sourceit.abstractfabric;

import org.sourceit.fabric.Shape;

public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {

        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        }
        if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        }
        if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }

        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }

}
