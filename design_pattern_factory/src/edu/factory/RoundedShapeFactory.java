package edu.factory;

public class RoundedShapeFactory extends AbstractFactory{

	@Override
	Shape getShape(String shapeType) {
		 if ("ROUNDEDSQUARE".equalsIgnoreCase(shapeType)) {
			return new RoundedSquare();
			
		} else if ("ROUNDEDRECTANGLE".equalsIgnoreCase(shapeType)) {
			return new RoundedRectangle();
		}
		return null;
	}

}
