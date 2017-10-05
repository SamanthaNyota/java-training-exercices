package io.robusta.animals.food;

import io.robusta.HasPrice;

public class Carrot extends Vegetal implements Ingredient {

	public Carrot(int calorie, int nutriment) {
		super(calorie, nutriment);
	}

	@Override
	public String toString() {
		return "Carrot [calorie=" + calorie + "," + " nutriment=" + nutriment + "]";
	}

	@Override
	public int getPrice() {
		return this.calorie / 2;
	}

}
