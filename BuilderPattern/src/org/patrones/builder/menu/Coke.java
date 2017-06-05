package org.patrones.builder.menu;

import org.patrones.builder.abstracta.ColdDrink;

public class Coke extends ColdDrink{

	@Override
	public float price() {
		return 30.0f;
	}
	@Override
	public String name() {
		return "Coke";
	}
	
	
}
