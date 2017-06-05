package org.patrones.abstracta.factory.productor;

import org.patrones.abstracta.factory.abstracta_fabrica.AbstractFactory;
import org.patrones.abstracta.factory.fabrica.ColorFactory;
import org.patrones.abstracta.factory.fabrica.ShapeFactory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String choice){


		if(choice.equalsIgnoreCase("SHAPE")){
			return new ShapeFactory();
		} else if(choice.equalsIgnoreCase("COLOR")){


			return new ColorFactory();
		}
		return null;
	}



	
	
	
}
