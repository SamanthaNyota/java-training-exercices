package io.robusta.animals.food;

/**
 * Created by Nicolas on 22/11/2016.
 */
public abstract class Vegetal implements Nutriment {
	int calorie;
	int nutriment;
	public Vegetal(int calorie, int nutriment) {
		this.calorie = calorie;
		this.nutriment = nutriment;
	}
	@Override
	public int getNutriment() {
		
		return nutriment;
	}
	
}
