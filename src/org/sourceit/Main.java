package org.sourceit;

import org.sourceit.abstractfabric.AbstractFactory;
import org.sourceit.abstractfabric.Color;
import org.sourceit.abstractfabric.FactoryProducer;
import org.sourceit.fabric.Shape;
import org.sourceit.fabric.ShapeFactory;
import org.sourceit.observer.Perimeter;
import org.sourceit.observer.Rectangle;
import org.sourceit.observer.Square;
import org.sourceit.singleton.Singleton;

public class Main {

    public static void testFabric() {
        System.out.println("--- Factory ---");
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape("CIRCLE");
        shape.draw();
        shape = factory.getShape("RECTANGLE");
        shape.draw();
        shape = factory.getShape("SQUARE");
        shape.draw();
        System.out.println("--- AbstractFactory ---");
    }

    public static void testAbstractFactory() {
        System.out.println("--- AbstractFactory ---");
        AbstractFactory factory = FactoryProducer.getFactory("SHAPE");
        Shape shape = factory.getShape("CIRCLE");
        shape.draw();
        shape = factory.getShape("RECTANGLE");
        shape.draw();
        shape = factory.getShape("SQUARE");
        shape.draw();
        factory = FactoryProducer.getFactory("COLOR");
        Color color = factory.getColor("RED");
        color.fill();
        System.out.println("--- AbstractFactory ---");
    }

    public static void testSingleton() {
        System.out.println("--- Singleton ---");
        Singleton singleton = Singleton.INSTANCE;
        singleton.showMessage();

        Singleton singleton1 = Singleton.INSTANCE;
        System.out.println("Equals: " + singleton.equals(singleton1));
        System.out.println("--- Singleton ---");
    }

    public static void testObserver() {
        System.out.println("--- Observer ---");
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println(rectangle);
        rectangle.addListener(new Square());
        rectangle.addListener(new Perimeter());
        rectangle.setWidth(10);
        System.out.println(rectangle);
        rectangle.setHeight(8);
        System.out.println(rectangle);
        System.out.println("--- Observer ---");
    }

    public static void main(String[] args) {
        testFabric();
        System.out.println();
        testAbstractFactory();
        System.out.println();
        testSingleton();
        System.out.println();
        testObserver();

    }

}
