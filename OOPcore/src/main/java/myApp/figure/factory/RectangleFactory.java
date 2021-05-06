package myApp.figure.factory;

import myApp.figure.Figure;
import myApp.figure.FigureFactory;
import myApp.figure.particularFigure.Rectangle;

public class RectangleFactory extends ShapeFactory {

    @Override
    public Figure newFigure() {
        return new Rectangle();
    }
}
