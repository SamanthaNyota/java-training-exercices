package io.robusta.animals.types;

import java.util.Arrays;

import io.robusta.animals.Pingouin;

public class ArrayApplication {

	public static void main(String[] args) {
		Pingouin kowalsky = new Pingouin("Kowalsky");
		Pingouin ricoh = new Pingouin("Ricoh");
		Pingouin soldat = new Pingouin("Soldat");
		Pingouin commandant = new Pingouin("Commandant");
		Pingouin tux = new Pingouin("Tux");

		Pingouin[] pingouins = new Pingouin[5];
		pingouins[0] = kowalsky; // affectation (setter)
		pingouins[1] = ricoh;
		pingouins[2] = soldat;
		pingouins[3] = commandant;
		pingouins[4] = tux;

		Pingouin third = pingouins[2]; // lecture (getter)
		System.out.println(third);
		System.out.println(pingouins);
		System.out.println(Arrays.toString(pingouins));

		// create array

		// direct way
		Pingouin[] directPingouins = { kowalsky, ricoh, tux };
		Pingouin[] almostDirectPingouins = new Pingouin[] { kowalsky, ricoh, tux };

		// directPingouins = {ricoh,tux};//cannot reference again with direct
		// construction
		// ... no idea why ...

		almostDirectPingouins = new Pingouin[] { ricoh, tux };

		int length = almostDirectPingouins.length;
		Pingouin last = almostDirectPingouins[length - 1];

		// warring length of string ... strange...

		boolean equals = "JO".length() == almostDirectPingouins.length;

	}

}
