package org.patrones.builder.construir;

import org.patrones.builder.carta.Meal;
import org.patrones.builder.menu.ChickenBurger;
import org.patrones.builder.menu.Coke;
import org.patrones.builder.menu.Pepsi;
import org.patrones.builder.menu.VegBurger;

public class MealBuilder {

	public Meal prepareVegMeal (){
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	public Meal prepareNonVegMeal (){
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
	
	
}
