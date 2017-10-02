package io.robusta.animals.types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import io.robusta.animals.Pingouin;

public class ListApplication {

	Pingouin kowalsky = new Pingouin("Kowalsky");
	Pingouin ricoh = new Pingouin("Ricoh");
	Pingouin soldat = new Pingouin("Soldat");
	Pingouin commandant = new Pingouin("Commandant");
	Pingouin tux = new Pingouin("Tux");

	public static void main(String[] args) {

		ListApplication app = new ListApplication();
		// app.launch();
		// app.mix();
		app.iterate();
	}

	void launch() {

		LinkedList<Pingouin> pingouins = new LinkedList<>();
		Collections.addAll(pingouins, kowalsky, ricoh, soldat, commandant, tux);

		System.out.println(pingouins);

		Pingouin last = pingouins.getLast(); // pour avoir le dernier
		last = pingouins.peekLast();

		Pingouin first = pingouins.getFirst(); // pour avoir le premier
		first = pingouins.peekFirst();
		first = pingouins.get(0);

		Pingouin second = pingouins.get(1); // pour avoir le deuxieme

		int length = pingouins.size();
		Pingouin penult = pingouins.get(length - 2);

		// we are odd
		Pingouin middle = pingouins.get(pingouins.size() / 2);
		System.out.println(middle);

	}

	void mix() {

		List<Pingouin> list = new ArrayList<>();
		Collections.addAll(list, kowalsky, ricoh, soldat, commandant, tux);

		Collections.shuffle(list);
		System.out.println(list);

		list = new LinkedList();

	}

	public void iterate() {
		List<Pingouin> pingouins = new ArrayList<>();
		Collections.addAll(pingouins, soldat, tux, commandant, ricoh, kowalsky);

		for (Pingouin current : pingouins) {
			System.out.println(current);
		}
		
		

	}

}
