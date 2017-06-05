package org.patrones.builder.abstracta;

import org.patrones.builder.implementos.Wrapper;
import org.patrones.builder.interfaces.Item;
import org.patrones.builder.interfaces.Packing;

public abstract class Burger implements Item{
	
	@Override
	public Packing packing(){
		return new Wrapper();
	}
	
	@Override
	public abstract float price();
	
}
