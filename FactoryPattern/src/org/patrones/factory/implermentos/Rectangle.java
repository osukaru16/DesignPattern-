package org.patrones.factory.implermentos;

import org.patrones.factory.interfaces.Shape;

public class Rectangle implements Shape{
	@Override
	public void draw() {
	System.out.println("Inside Rectangle::draw() method.");
	}
}
