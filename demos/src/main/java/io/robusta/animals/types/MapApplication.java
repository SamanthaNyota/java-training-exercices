package io.robusta.animals.types;

import java.util.HashMap;
import java.util.Map.Entry;

import io.robusta.animals.Pingouin;

public class MapApplication {

	public static void main(String[] args) {
		MapApplication app = new MapApplication();
		app.init();
		app.iterateEntries();
	}

	public void init() {

		
		Pingouin kowalsky = new Pingouin("Kowalsky");
		Pingouin ricoh = new Pingouin("Ricoh");
		Pingouin soldat = new Pingouin("Soldat");
		Pingouin commandant = new Pingouin("Commandant");
		Pingouin tux = new Pingouin("Tux");

		HashMap<Pingouin, Integer> map = new HashMap<>();

		map.put(tux, 90);
		map.put(ricoh, 120);
		map.put(soldat, -12);
		map.put(kowalsky, 13);
		map.put(commandant, 20);
		System.out.println(map);

		System.out.println(map.get(ricoh));
		System.out.println("map size: " + map.size());

		map.put(soldat, 80);
		System.out.println(map.get(soldat));
		System.out.println(map.keySet());

	}
	
	public void iterateEntries(){
		
		Pingouin kowalsky = new Pingouin("Kowalsky");
		Pingouin ricoh = new Pingouin("Ricoh");
		Pingouin soldat = new Pingouin("Soldat");
		Pingouin commandant = new Pingouin("Commandant");
		Pingouin tux = new Pingouin("Tux");

		HashMap<Pingouin, Integer> map = new HashMap<>();

		map.put(tux, 90);
		map.put(ricoh, 120);
		map.put(soldat, -12);
		map.put(kowalsky, 13);
		map.put(commandant, 20);		
		
		
		for (Entry<Pingouin, Integer> entry : map.entrySet()){
			
			System.out.println(entry.getKey() + " has " + entry.getValue() + " points.");

		}
				
	}
}