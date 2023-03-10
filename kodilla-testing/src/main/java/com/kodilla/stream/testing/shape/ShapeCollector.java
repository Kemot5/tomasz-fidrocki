package com.kodilla.stream.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapeCollector = new ArrayList<>();


    public List<Shape> getShapeCollector() {
        return shapeCollector;
    }
    public void addFigure(Shape shape) {
        shapeCollector.add(shape);
    }
    public boolean removeFigure( Shape shape) {
        return shapeCollector.remove(shape);
    }
    public Shape getFigure(int n) {
        if( n>=0 && n<shapeCollector.size()) {
            return shapeCollector.get(n);
        }else {
            return null;
        }
    }
    public Shape showFigure () {
        System.out.println(shapeCollector.toString());
        return null;
    }


    public void addFigure(String circle, String thisIsFirtShape) {
    }
}

