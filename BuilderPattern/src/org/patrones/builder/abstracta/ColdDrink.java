package org.patrones.builder.abstracta;

import org.patrones.builder.implementos.Bottle;
import org.patrones.builder.interfaces.Item;
import org.patrones.builder.interfaces.Packing;

public abstract class ColdDrink implements Item{

	
	@Override
	public Packing packing(){
		return new Bottle();
	}
	
	@Override
	public abstract float price();
	
}
