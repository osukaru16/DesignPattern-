package org.patrones.factory.implermentos;

import org.patrones.factory.interfaces.Shape;

public class Circle implements Shape{
	@Override
	public void draw() {
	System.out.println("Inside Circle::draw() method.");
	}
}
