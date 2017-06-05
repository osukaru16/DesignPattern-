package org.patrones.builder.implementos;

import org.patrones.builder.interfaces.Packing;

public class Bottle implements Packing{

	@Override
	public String pack(){
		return "Bottle";
	}
}
