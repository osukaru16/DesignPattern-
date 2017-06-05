package org.patrones.builder.menu;

import org.patrones.builder.abstracta.Burger;


public class VegBurger extends Burger{

	
	@Override
	public float price() {
		return 25.0f;
	}
	@Override
	public String name() {
		return "Veg Burger";
	}
	
	
	
	
	
	
}
