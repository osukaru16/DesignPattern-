package org.patrones.abstracta.factory.abstracta_fabrica;

import org.patrones.abstracta.factory.interfaces.Color;
import org.patrones.abstracta.factory.interfaces.Shape;

public abstract class AbstractFactory {
	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape) ;
}
