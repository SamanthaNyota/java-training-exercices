package io.robusta.animals.food;

import java.util.*;

import io.robusta.HasPrice;

public class Meal extends ArrayList<Ingredient> implements Collection<Ingredient>{

	public Meal(Ingredient... nutriments) {
		for (Ingredient current : nutriments) {
			this.add(current);
		}
	}

	public int getNutriments() {

		List<Ingredient> meal = this;

		int nutriments = 0;
		for (Ingredient ingredient : meal) {

			nutriments = nutriments + ingredient.getNutriment();
		}

		return nutriments;

	}

	public int getPrice() {

		int price = 0;
		for (HasPrice ingredient : this) {
			price = price + ingredient.getPrice();
		}
		
		return price;
	}
	public Ingredient cheapest(){
		TreeSet<Ingredient> ingredients = new TreeSet<>();
		ingredients.addAll(this);
		return ingredients.first();



	}

}
