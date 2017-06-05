package org.patrones.builder.menu;

import org.patrones.builder.abstracta.ColdDrink;

public class Pepsi extends ColdDrink{

	@Override
	public float price() {
		return 35.0f;
	}
	
	@Override
	public String name() {
		return "Pepsi";
	}
	
	
	
	
}
