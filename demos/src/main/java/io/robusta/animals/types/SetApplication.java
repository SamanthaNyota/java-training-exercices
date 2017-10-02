package io.robusta.animals.types;

import java.util.HashSet;
import java.util.Iterator;

import io.robusta.animals.Pingouin;

public class SetApplication {

	public static void main(String[] args) {
		SetApplication app = new SetApplication();
		app.init();
	}
	
	public void init(){
				
		Pingouin kowalsky = new Pingouin("Kowalsky");
        Pingouin ricoh = new Pingouin("Ricoh");
        Pingouin soldat = new Pingouin("Soldat");
        Pingouin commandant = new Pingouin("Commandant");
        Pingouin tux = new Pingouin("Tux");
        
		HashSet<Pingouin> set = new HashSet<>();
		
		set.add(tux);
		set.add(commandant);
		set.add(soldat);
		
		System.out.println(set.size());
		set.add(soldat);
		System.out.println(set.size());
		
		Pingouin imposteur = new Pingouin("Soldat");
		set.add(imposteur);
		System.out.println(set.size());
		System.out.println(set);
		
		set.add(ricoh);
		set.add(kowalsky);
		System.out.println(set.size());
		
		Iterator<Pingouin> iterator = set.iterator();
		System.out.println(iterator.next());
		
		//let's start again
		
		iterator = set.iterator();
		while (iterator.hasNext()){
			Pingouin current = iterator.next();
			System.out.println(current);
		}
		
		System.out.println("----------more pretty----------");
		
		for (Pingouin current : set){
			System.out.println(current);
		}
		
		
		


	}
}
