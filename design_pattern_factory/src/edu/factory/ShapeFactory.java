package edu.factory;

public class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shapeType) {
		if ("RECTANGLE".equalsIgnoreCase(shapeType)) {
			return new Rectangle();
			
		} 
		// TODO Auto-generated method stub
		return null;
	}

}
