package org.patrones.abstracta.factory.implementos;

import org.patrones.abstracta.factory.interfaces.Color;

public class Blue implements Color{
	@Override
	public void fill() {
	System.out.println("Inside Blue::fill() method.");
	}
}
