package org.patrones.abstracta.factory.implementos;

import org.patrones.abstracta.factory.interfaces.Color;

public class Green implements Color{
	@Override
	public void fill() {
	System.out.println("Inside Green::fill() method.");
	}
}
