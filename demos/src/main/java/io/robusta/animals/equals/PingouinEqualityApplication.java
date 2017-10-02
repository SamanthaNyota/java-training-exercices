package io.robusta.animals.equals;

import io.robusta.animals.Pingouin;

public class PingouinEqualityApplication {

	public static void main(String[] args) {
		Pingouin jack = new Pingouin ("Jack");
		Pingouin john = new Pingouin ("John");
		
		
		System.out.println(jack.equals(john));
		jack = john;
	}

}
