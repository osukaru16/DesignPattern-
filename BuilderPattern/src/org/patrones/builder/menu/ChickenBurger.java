package org.patrones.builder.menu;

import org.patrones.builder.abstracta.Burger;

public class ChickenBurger extends Burger{

	@Override
	public float price() {
		return 50.5f;
	}
	@Override
	public String name() {
		return "Chicken Burger";
	}
	
	
	
}
