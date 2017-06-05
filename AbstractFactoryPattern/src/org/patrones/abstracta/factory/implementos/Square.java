package org.patrones.abstracta.factory.implementos;

import org.patrones.abstracta.factory.interfaces.Shape;

public class Square implements Shape {
	@Override
	public void draw() {
	System.out.println("Inside Square::draw() method.");
	}
}
