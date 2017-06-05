package org.patrones.abstracta.factory.fabrica;

import org.patrones.abstracta.factory.abstracta_fabrica.AbstractFactory;
import org.patrones.abstracta.factory.implementos.Blue;
import org.patrones.abstracta.factory.implementos.Green;
import org.patrones.abstracta.factory.implementos.Red;
import org.patrones.abstracta.factory.interfaces.Color;
import org.patrones.abstracta.factory.interfaces.Shape;

public class ColorFactory extends AbstractFactory{
	@Override
	public Shape getShape(String shapeType){
		return null;
	}
	@Override
	public Color getColor(String color) {
		if(color == null){
			return null;
		}
		if(color.equalsIgnoreCase("RED")){
			return new Red();
		} else if(color.equalsIgnoreCase("GREEN")){
			return new Green();
		} else if(color.equalsIgnoreCase("BLUE")){
			return new Blue();
		}
		return null;
	}
}
