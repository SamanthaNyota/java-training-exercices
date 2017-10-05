package io.robusta.animals.food;

import io.robusta.HasPrice;

/**
 * Created by Nicolas on 22/11/2016.
 */
public class Potato extends Vegetal implements Ingredient{
	
	int thickeness = 3;
	
	public Potato(int calorie, int nutriment) {
		
		super(calorie, nutriment);
		
		/*this.calorie = calorie;
		this.nutriment = nutriment; */
	}

	@Override
	public String toString() {
		return "Potato [thickeness=" + thickeness + ", "
				+ "calorie=" + calorie + ", "
						+ "nutriment=" + nutriment + "]";
	}

	@Override
	public int getPrice() {
		return this.calorie/3;
	}
	
	
	
}
