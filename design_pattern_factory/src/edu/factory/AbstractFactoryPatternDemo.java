package edu.factory;

public class AbstractFactoryPatternDemo {
	
	public static void main (String args[]) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory(true);
		Shape Shape1= shapeFactory.getShape("RECTANGLE");
		Shape1.draw();
		
		Shape Shape2= shapeFactory.getShape("SQUARE");
		Shape2.draw();
		
		
	}

}
