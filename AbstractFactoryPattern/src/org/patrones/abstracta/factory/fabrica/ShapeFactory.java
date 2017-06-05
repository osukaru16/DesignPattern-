package org.patrones.abstracta.factory.fabrica;

import org.patrones.abstracta.factory.interfaces.Color;
import org.patrones.abstracta.factory.interfaces.Shape;
import org.patrones.abstracta.factory.abstracta_fabrica.AbstractFactory;
import org.patrones.abstracta.factory.implementos.Circle;
import org.patrones.abstracta.factory.implementos.Rectangle;
import org.patrones.abstracta.factory.implementos.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType){
		if(shapeType == null){
			return null;
		}
		if(shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		} else if(shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		} else if(shapeType.equalsIgnoreCase("SQUARE")){
			return new Square();
		}
		return null;
	}
	
	@Override
	public Color getColor(String color) {
		return null;
	}
}


